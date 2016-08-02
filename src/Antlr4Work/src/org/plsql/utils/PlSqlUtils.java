package org.plsql.utils;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.antlr.generated.PlSqlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

public class PlSqlUtils {
    // счетчик для непонятных идентификаторов, которые не вычислить
    private static int declareSeq = 0;

    // допустимые символы для генерации идентификатора Oracle
    private static final String validIdentifierChars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ$#_";

    public static String unquote(String s) {
        if (s != null && ((s.startsWith("\"") && s.endsWith("\"")) || (s.startsWith("'") && s.endsWith("'")))) {
            s = s.substring(1, s.length() - 1);
        }
        return s;
    }

    // генерация имени идентификатора по строке данных
    public static String makeOraIdentifier(String str) {
        StringBuilder sb = new StringBuilder(str.length() * 2);
        String tr;

        // allowed $ # _, maximum 30 symbols
        str = str.toLowerCase().trim();
        str = str.replace("%s", "$");
        str = str.replaceAll("[ .,:;-=]+", "_"); // чтобы разделителить текст

        for (char ch : str.toCharArray()) {
            if (validIdentifierChars.indexOf(ch) >= 0) {
                sb.append(ch);
            } else {
                // недопустимый символ
                tr = Translit.cyr2lat(ch);
                if (!tr.isEmpty() && (validIdentifierChars.indexOf(tr.charAt(0)) >= 0)) {
                    sb.append(tr);
                }
            }
        }

        tr = sb.toString().trim().replaceAll("_$", "");

        if (tr.isEmpty()) {
            tr = "gen_" + Integer.toString(++declareSeq);
        }
        tr = "l$" + tr.replaceAll("_+", "_");

        if (tr.length() > 30)
            tr = tr.substring(0, 29);

        tr = tr.replaceAll("_$", "");

        return tr;
    }

    //  public static String getFileContent(FileInputStream fis, String encoding) throws IOException {
    //  try (BufferedReader br = new BufferedReader(new InputStreamReader(fis, encoding))) {
    //      StringBuilder sb = new StringBuilder();
    //      String line;
    //      while ((line = br.readLine()) != null) {
    //          sb.append(line);
    //          sb.append('\n');
    //      }
    //      return sb.toString();
    //  }
    //}

    public static void writeToFile(String fileName, String text) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(fileName);
        writer.println(text);
        writer.close();
    }

    // возвращает оригинальный текст токена из исходного файла 
    public static String getOriginalText(ANTLRInputStream input, ParserRuleContext ctx) {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        Interval interval = new Interval(a, b);
        return input.getText(interval);
    }
    
    public static int getLine(/*ANTLRInputStream input,*/ ParserRuleContext ctx) {
        //Interval sourceInterval = ctx.getSourceInterval();        
        //Token firstToken = input.get(sourceInterval.a);
        //int line = firstToken.getLine();
        return ctx.start.getLine();
    }

    // логгирование правила (для конкатенаций)
    public static void logCharContext(String prefix, ParserRuleContext ctx) {
        System.out.println(prefix + ctx.getText() + ", [startType: " + PlSqlParser.VOCABULARY.getSymbolicName(ctx.start.getType()) + ", childs: "
                + ctx.getChildCount() + "]");
    }
}
