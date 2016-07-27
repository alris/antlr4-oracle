package org.plsql;

import org.antlr.generated.PlSqlLexer;
import org.antlr.generated.PlSqlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.plsql.utils.PlSqlErrorListener;

/**
 * Класс для объединения всей логики парсинга для использования его в
 * PlSqlRuleVisitor
 * 
 */
public class PlSqlParserTree {

    private ANTLRInputStream input;
    private PlSqlLexer lexer;
    private CommonTokenStream tokens;
    private PlSqlParser parser;
    private TokenStreamRewriter rewriter;
    private ParseTree parseTree;

    public ANTLRInputStream getInput() {
        return input;
    }

    public TokenStreamRewriter getRewriter() {
        return rewriter;
    }

    public ParseTree getParseTree() {
        return parseTree;
    }

    public PlSqlParserTree(ANTLRInputStream input) {
        this.input = input;
        parseInput();
    }

    // основная логика парсера
    private ParseTree parseInput() {
        lexer = new PlSqlLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new PlSqlErrorListener());

        tokens = new CommonTokenStream(lexer);

        parser = new PlSqlParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new PlSqlErrorListener());

        rewriter = new TokenStreamRewriter(tokens);

        parseTree = parser.compilation_unit();

        return parseTree;
    }

    public String getResultText() {
        return rewriter.getText();
    }
}
