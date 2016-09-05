package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.plsql.utils.*;
import org.plsql.*;
import org.plsql.visitor.*;

public class PlSqlLiteralExtractor {

    private static Properties prop = new Properties();

    public static void processFile(String fileName) throws IOException {
        String parsedSql;
        PlSqlParserTree tree = null;

        System.out.println("Start " + fileName);
        String concatenationFormat = prop.getProperty("concatenation_format");
        String constantFormat = prop.getProperty("constant_format");

        FileInputStream parseFile = new FileInputStream(fileName);
        try {
            // первый проход для сжатия конкатенаций строк в стиль format('%1', [p1])            
            tree = new PlSqlParserTree(new ANTLRInputStream(parseFile));
            ConcatenationVisitor visitor = new ConcatenationVisitor(tree);
            if ((concatenationFormat != null) && (!concatenationFormat.isEmpty())) {
                visitor.setConcatenationFormat(concatenationFormat);
            }
            visitor.visit();

            parsedSql = tree.getResultText();
            // обработанный текст первого прохода
            // System.out.println(parsedSql);
        } finally {
            parseFile.close();
        }

        PlSqlUtils.writeToFile(fileName + "_2", parsedSql);

        // вторая стадия
        System.out.println("--------------------------------");

        // второй проход - перенос строковых литералов вверх
        tree = new PlSqlParserTree(new ANTLRInputStream(parsedSql));
        StringVisitor visitor = new StringVisitor(tree);
        if ((constantFormat != null) && (!constantFormat.isEmpty())) {
            visitor.setConstantFormat(constantFormat);
        }
        visitor.visit();

        // добавление блока констант в DECLARE
        String declares = visitor.createConstants();

        parsedSql = tree.getResultText();

        System.out.println(declares);

        // System.out.println(parsedSql);
        PlSqlUtils.writeToFile(fileName + "_3", parsedSql);

        System.out.println("End");
    }

    /**
     * Нужно найти строки без конкатенаций или все конкатенации, где есть строка
     * и преобразовать это к Format('%1 %2 %3', [p1, p2, p3])
     */
    public static void main(String[] args) {
        prop = PlSqlUtils.loadProperties();
       
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                try {
                    processFile(args[i]);
                } catch (IOException e) {
                    PlSqlUtils.loger.log(Level.WARNING, "Error processing " + args[i], e);
                }
            }
        } else {
            String fileName = prop.getProperty("default_file_name");

            if ((fileName != null) && (!fileName.isEmpty())) {
                try {
                    processFile(fileName);
                } catch (IOException e) {
                    PlSqlUtils.loger.log(Level.WARNING, "Error processing " + fileName, e);
                }
            } else {
                System.out.println("No files to parse");
                return;
            }
        }
    }
}
