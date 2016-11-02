package org.plsql.visitor;

import java.text.Format;
import java.util.HashMap;
import java.util.Map;

import org.antlr.generated.PlSqlParser.Function_callContext;
import org.antlr.generated.PlSqlParser.Function_specContext;
import org.antlr.generated.PlSqlParser.Id_expressionContext;
import org.antlr.generated.PlSqlParser.Package_bodyContext;
import org.antlr.generated.PlSqlParser.Package_nameContext;
import org.antlr.generated.PlSqlParser.Package_specContext;
import org.antlr.generated.PlSqlParser.Procedure_specContext;
import org.antlr.generated.PlSqlParser.Routine_clauseContext;
import org.antlr.generated.PlSqlParser.StatementContext;
import org.antlr.generated.PlSqlParser.Unit_statementContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.plsql.PlSqlParserTree;
import org.plsql.utils.PlSqlUtils;

public class CallGraphVisitor extends PlSqlRuleVisitor {
    public enum ExpressionType {
        PACKAGE, FUNCTION, PROCEDURE, VARIABLE, UNKNOWN
    }

    public enum VisitMode {
        FIRST_PASS, SECOND_PASS
    }

    public VisitMode visitMode = VisitMode.FIRST_PASS;

    public static Map<String, ExpressionType> idMap = new HashMap<String, ExpressionType>();
    private String currentSchema = null;

    public CallGraphVisitor(PlSqlParserTree tree) {
        super(tree);
    }

    private void logContext(ParserRuleContext ctx) {
        System.out.printf("%04d > %s\n",ctx.start.getLine(), PlSqlUtils.getOriginalText(input, ctx));
    }

    private String getFullProcName(ParserRuleContext ctx) {
        ParserRuleContext c = ctx;

        String fullName = "";

        //fullName = ctx.getText();

        while (c != null) {
            if (c instanceof Function_specContext) {
                Function_specContext fc = (Function_specContext) c;
                fullName = PlSqlUtils.getOriginalText(input, fc.function_name()) + "->Type=FUNCTION:" + fullName;
            } else if (c instanceof Procedure_specContext) {
                Procedure_specContext pc = (Procedure_specContext) c;
                fullName = PlSqlUtils.getOriginalText(input, pc.procedure_name()) + "->Type=PROCEDURE:" + fullName;
            } else if (c instanceof Package_bodyContext) {
                Package_bodyContext pbc = (Package_bodyContext) c;
                // TODO: здесь индекс у списка пакетов!
                fullName = PlSqlUtils.getOriginalText(input, pbc.package_name(0)) + "->TYPE=PACKAGE:" + fullName;
                break;
            }
            c = c.getParent();
        }

        return fullName;
    }

    @Override
    public Void visitPackage_name(Package_nameContext ctx) {
        if (visitMode == VisitMode.FIRST_PASS) {
            String name = PlSqlUtils.getOriginalText(input, ctx);
            System.out.println(PlSqlUtils.getLine(ctx) + " PACKAGE " + name);

            currentSchema = PlSqlUtils.getOriginalText(input, ctx.schema_name());
            System.out.println("  SCHEMA: " + currentSchema);

            idMap.put(name, ExpressionType.PACKAGE);
            //        logContext(ctx);
        }

        return super.visitPackage_name(ctx);
    }

    @Override
    public Void visitFunction_spec(Function_specContext ctx) {
        if (visitMode == VisitMode.FIRST_PASS) {
            String name = getFullProcName(ctx/*.function_name()*/);
            System.out.println(PlSqlUtils.getLine(ctx) + " FUNCTION " + name);

            idMap.put(name, ExpressionType.FUNCTION);
            //        logContext(ctx);
        }
        return super.visitFunction_spec(ctx);
    }

    @Override
    public Void visitProcedure_spec(Procedure_specContext ctx) {
        if (visitMode == VisitMode.FIRST_PASS) {
            String name = getFullProcName(ctx/*.procedure_name()*/);
            System.out.println(PlSqlUtils.getLine(ctx) + " PROCEDURE " + name);

            idMap.put(name, ExpressionType.PROCEDURE);
            //        logContext(ctx);
        }
        return super.visitProcedure_spec(ctx);
    }

    @Override
    public Void visitRoutine_clause(Routine_clauseContext ctx) {
        String name = getFullProcName(ctx.routine_name());
        System.out.println("-> call routine " + name);

        return super.visitRoutine_clause(ctx);
    }

    //    @Override
    //    public Void visitFunction_call(Function_callContext ctx) {
    //        //        String name = getFullProcName(ctx.routine_name());
    //        //        System.out.println("-> call " + name);
    //
    //        return super.visitFunction_call(ctx);
    //    }

    private boolean isFunctionOrProcedureSpec(Id_expressionContext ctx) {
        ParserRuleContext c = ctx;

        while (c != null) {
            if ((c instanceof Function_specContext) || (c instanceof Procedure_specContext)) {
                return true;
            } else if (c instanceof StatementContext) {
                return false;
            }
            c = c.getParent();
        }
        return false;
    }

    // здесь нужно отловить вызов функции
    // она должна быть или определена выше, или должен быть указан пакет, или это глобальная функция
    @Override
    public Void visitId_expression(Id_expressionContext ctx) {
        if (visitMode == VisitMode.SECOND_PASS) {
            String name = getFullProcName(ctx);
            logContext(ctx);

            // если в хеше есть определение, то это может быть вызов функции
            ExpressionType type = idMap.get(name);
            //System.out.println("  // " + name + " type " + type);

            if ((type == ExpressionType.FUNCTION) || (type == ExpressionType.PROCEDURE)) {
                // вызов функции, которая попадалась ранее
                if (!isFunctionOrProcedureSpec(ctx)) {
                    System.out.printf("\t->> call [%s]\n", name);
                }
            } else if (type == ExpressionType.PACKAGE) {
                System.out.printf("->> package [%s]\n", name);
            } else {
                // при спуске по дереву, для процедур и функций заходит сюда, но это не требуется
                if (!isFunctionOrProcedureSpec(ctx)) {
                    System.out.printf("- found new type [%s]", name + " [" + ctx.getClass().toString() + "]");
                }
            }
        }
        return super.visitId_expression(ctx);
    }
}
