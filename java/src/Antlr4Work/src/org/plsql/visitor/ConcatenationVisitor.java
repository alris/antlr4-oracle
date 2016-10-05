package org.plsql.visitor;

import java.util.ArrayList;

import org.antlr.generated.PlSqlParser;
import org.antlr.generated.PlSqlParser.ConcatenationContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.plsql.PlSqlParserTree;
import org.plsql.utils.PlSqlUtils;

public class ConcatenationVisitor extends PlSqlRuleVisitor {

    // default
    // use: CREATE OR REPLACE TYPE tvarchararray AS TABLE of VARCHAR2(256)
    private String concatenationFormat = "format('%s', tvarchararray(%s))";

    public void setConcatenationFormat(String concatenationFormat) {
        this.concatenationFormat = concatenationFormat;
        System.out.println("Concatenation format: " + concatenationFormat);
    }

    public ConcatenationVisitor(PlSqlParserTree tree) {
        super(tree);
    }

    // Сжатие конкатенаций в одну строку
    @Override
    public Void visitConcatenation(ConcatenationContext ctx) {
        Void res = super.visitConcatenation(ctx);

        PlSqlUtils.logCharContext("# :concatenation: ", ctx);

        System.out.println("- original: " + PlSqlUtils.getOriginalText(input, ctx)); // CHAR_STRING

        // System.out.println("-- " + ctx.start.getText() + " : " +

        // склеивание конкатенаций внутри токена
        if (ctx.getChildCount() > 1) {
            int i = 1;

            ArrayList<String> replacer = new ArrayList<String>();
            ArrayList<String> parameters = new ArrayList<String>();

            // все токены в конкатенации
            for (ParserRuleContext r : ctx.getRuleContexts(ParserRuleContext.class)) {

                PlSqlUtils.logCharContext("  --> ", r);

                if (r.start.getType() == PlSqlParser.CHAR_STRING) {
                    // это строка - вставляется внутрь строки format('эта строка')
                    replacer.add(PlSqlUtils.unquote(PlSqlUtils.getOriginalText(input, r)));
                } else if (r.start.getType() != PlSqlParser.CONCATENATION_OP) {
                    // это выражение - вставляется с использованием параметра format('%1', [p1])
                    replacer.add("%" + Integer.toString(i++));
                    parameters.add(PlSqlUtils.getOriginalText(input, r));
                }
            }

            // замена всей найденной конструкции на описанный формат
            String newText = String.format(concatenationFormat, String.join("", replacer), String.join(", ", parameters));

            System.out.println("- rewritten: " + newText);

            rewriter.replace(ctx.start, ctx.stop, newText);
        } else {
            System.out.println("- skip: " + ctx.getText());
        }

        return res;
    }
}
