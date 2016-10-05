@header
{
package org.antlr.generated;
}

//@header
//{
//package org.antlr.generated;
//
////import org.antlr.logic.*;
//}

//@lexer::members
//{
//    // возвращает оригинальный текст токена из исходного файла 
//    public String getOriginalText(ParserRuleContext ctx) {
//        System.out.println(ctx.start);
//        System.out.println(ctx.stop);
//
//        if (ctx.start != null) {
//            int a = ctx.start.getStartIndex() + 1;
//            int b = ctx.start.getStartIndex();
//            Interval interval = new Interval(a, b);
//            return _input.getText(interval);
//        }
//        return "x";
//    }
//
//    private CommonToken commonToken(int type, String text) {
//        int stop = this.getCharIndex() - 1;
//        int start = text.isEmpty() ? stop : stop - text.length() + 1;
//        return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
//    }
//
//    boolean atStartOfInput() {
//        return super.getCharPositionInLine() == 0 && super.getLine() == 1;
//    }
//}
