package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.plsql.utils.*;
import org.plsql.*;
import org.plsql.visitor.*;

public class PlSqlCallGraph {

    private static Properties prop = new Properties();

    public static void loadProperties() {
        InputStream input = null;

        try {
            input = new FileInputStream("config.properties");
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void processFile(String fileName) throws IOException {
        String parsedSql;
        PlSqlParserTree tree = null;

        System.out.println("Start " + fileName);

        FileInputStream parseFile = new FileInputStream(fileName);
        try {
            tree = new PlSqlParserTree(new ANTLRInputStream(parseFile));

            CallGraphVisitor visitor = new CallGraphVisitor(tree);

            visitor.visit();

            parsedSql = tree.getResultText();
            // обработанный текст
            // System.out.println(parsedSql);
        } finally {
            parseFile.close();
        }

        //        PlSqlUtils.writeToFile(fileName + "_2", parsedSql);

        System.out.println("End");

        CallGraphVisitor.idMap.forEach((k, v) -> System.out.println("Key: " + k + ": Value: " + v));
    }

    /**
     * Нужно найти строки без конкатенаций или все конкатенации, где есть строка
     * и преобразовать это к Format('%1 %2 %3', [p1, p2, p3])
     */
    public static void main(String[] args) {
        loadProperties();

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                try {
                    processFile(args[i]);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } else {
            String fileName = prop.getProperty("default_file_name");

            if ((fileName == null) || (fileName.isEmpty())) {
                System.out.println("No files to parse");
                return;
            }

            try {
                processFile(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
