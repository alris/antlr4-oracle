package org.plsql.utils;

import java.util.List;

import org.antlr.generated.*;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

public class PlSqlErrorListener extends BaseErrorListener {

    public int lastError = -1;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Parser parser = (Parser) recognizer;
        String name = parser.getSourceName();
        TokenStream tokens = parser.getInputStream();

        Token offSymbol = (Token) offendingSymbol;
        int thisError = offSymbol.getTokenIndex();
        if (offSymbol.getType() == -1 && thisError == tokens.size() - 1) {
            System.err.println("DEBUG: " + name + ": Incorrect error: " + msg);
            return;
        }
        String offSymName = PlSqlLexer.VOCABULARY.getSymbolicName(offSymbol.getType());

        List<String> stack = parser.getRuleInvocationStack();
        // Collections.reverse(stack);

        System.err.println("Source name: " + name);
        System.err.println("Rule stack: " + stack);
        System.err.println("At line " + line + ":" + charPositionInLine + " at " + offSymName + ": " + msg);

        if (thisError > lastError + 10) {
            lastError = thisError - 10;
        }
        for (int idx = lastError + 1; idx <= thisError; idx++) {
            Token token = tokens.get(idx);
            if (token.getChannel() != Token.HIDDEN_CHANNEL)
                System.err.println("  " + token.toString());
        }
        lastError = thisError;
    }
}