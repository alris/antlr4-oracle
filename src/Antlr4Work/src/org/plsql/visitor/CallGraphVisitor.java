package org.plsql.visitor;

import java.util.HashMap;
import java.util.Map;

import org.antlr.generated.PlSqlParser.Function_callContext;
import org.antlr.generated.PlSqlParser.Function_specContext;
import org.antlr.generated.PlSqlParser.Id_expressionContext;
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
    private enum ExpressionType {
        FUNCTION, VARIABLE, UNKNOWN
    }

    private static Map<String, ExpressionType> idMap = new HashMap<String, ExpressionType>();
    private String currentSchema = null;

    public CallGraphVisitor(PlSqlParserTree tree) {
        super(tree);
    }

    private String getFullProcName(ParserRuleContext ctx) {
        ParserRuleContext c = ctx;

        String fullName = null;

        fullName = ctx.getText();

        while (c != null) {
            c = c.getParent();

            if (c instanceof Function_specContext) {
                Function_specContext fc = (Function_specContext) c;
                fullName = PlSqlUtils.getOriginalText(input, fc.function_name()) + ":F." + fullName;
            } else if (c instanceof Procedure_specContext) {
                Procedure_specContext pc = (Procedure_specContext) c;
                fullName = PlSqlUtils.getOriginalText(input, pc.procedure_name()) + ":P." + fullName;
            } else if (c instanceof Package_nameContext) {
                Package_nameContext pnc = (Package_nameContext) c;
                // TODO: здесь индекс у списка пакетов!
                fullName = PlSqlUtils.getOriginalText(input, pnc) + ":PKG." + fullName;
                break;
            }
        }

        return fullName;
    }

    @Override
    public Void visitPackage_name(Package_nameContext ctx) {
        String name = PlSqlUtils.getOriginalText(input, ctx);
        System.out.println("PACKAGE " + name);

        currentSchema = PlSqlUtils.getOriginalText(input, ctx.schema_name());
        System.out.println("  SCHEMA: " + currentSchema);

        return super.visitPackage_name(ctx);
    }

    @Override
    public Void visitFunction_spec(Function_specContext ctx) {
        String name = PlSqlUtils.getOriginalText(input, ctx.function_name());
        System.out.println("FUNCTION " + name);

        idMap.put(name, ExpressionType.FUNCTION);

        return super.visitFunction_spec(ctx);
    }

    @Override
    public Void visitProcedure_spec(Procedure_specContext ctx) {
        String name = getFullProcName(ctx.procedure_name());
        System.out.println("PROCEDURE " + name);

        idMap.put(name, ExpressionType.FUNCTION);

        return super.visitProcedure_spec(ctx);
    }

    @Override
    public Void visitRoutine_clause(Routine_clauseContext ctx) {
        String name = getFullProcName(ctx.routine_name());
        System.out.println("-> call routine " + name);

        return super.visitRoutine_clause(ctx);
    }

    @Override
    public Void visitFunction_call(Function_callContext ctx) {
        //        String name = getFullProcName(ctx.routine_name());
        //        System.out.println("-> call " + name);

        return super.visitFunction_call(ctx);
    }

    private boolean isFunctionOrProcedureSpec(Id_expressionContext ctx) {
        ParserRuleContext c = ctx;

        while (c != null) {
            c = c.getParent();
            if ((c instanceof Function_specContext) || (c instanceof Procedure_specContext)) {
                return true;
            } else if (c instanceof StatementContext) {
                return false;
            }
        }

        return false;
    }

    // здесь нужно отловить вызов функции
    // она должна быть или определена выше, или должен быть указан пакет, или это глобальная функция
    @Override
    public Void visitId_expression(Id_expressionContext ctx) {
        String name = getFullProcName(ctx);

        // если в хеше есть определение, то это может быть вызов функции
        ExpressionType type = idMap.get(name);
        //System.out.println("  // " + name + " type " + type);

        if (type == ExpressionType.FUNCTION) {
            if (!isFunctionOrProcedureSpec(ctx)) {
                System.out.println("->> call " + name + " - определена выше");
            }
        } else {
            // при спуске по дереву, для процедур и функций заходит сюда, но это не требуется
            if (!isFunctionOrProcedureSpec(ctx)) {
                System.out.println("  new " + name + " [" + ctx.getClass().toString() + "]");
            }
        }
        return super.visitId_expression(ctx);
    }
}
