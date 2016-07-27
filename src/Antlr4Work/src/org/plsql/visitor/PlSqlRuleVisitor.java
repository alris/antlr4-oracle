package org.plsql.visitor;

import org.antlr.generated.PlSqlBaseVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.plsql.PlSqlParserTree;

/**
 * Базовый класс для наследования всех новых *Visitor
 */
public class PlSqlRuleVisitor extends PlSqlBaseVisitor<Void> {
    protected ANTLRInputStream input;
    protected TokenStreamRewriter rewriter;
    protected ParseTree parseTree;

    @SuppressWarnings("unused")
    private PlSqlRuleVisitor() {
        // нельзя создавать без параметров
    }

    public PlSqlRuleVisitor(PlSqlParserTree tree) {
        input = tree.getInput();
        rewriter = tree.getRewriter();
        parseTree = tree.getParseTree();
    }

    public Void visit() {
        return super.visit(parseTree);
    }
}
