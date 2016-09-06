package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.plsql.utils.*;
import org.plsql.*;
import org.plsql.visitor.*;

public class PlSqlCallGraph {

    private static Properties prop = new Properties();

    public static void processFile(String fileName) throws IOException {
        String parsedSql = null;
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

    public static void main(String[] args) {
        prop = PlSqlUtils.loadProperties();
       
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                try {
                    processFile(args[i]);
                } catch (IOException e) {
                    PlSqlUtils.logger.log(Level.WARNING, "Error processing " + args[i], e);
                }
            }
        } else {
            String fileName = prop.getProperty("default_file_name");

            if ((fileName != null) && (!fileName.isEmpty())) {
                try {
                    processFile(fileName);
                } catch (IOException e) {
                    PlSqlUtils.logger.log(Level.WARNING, "Error processing " + fileName, e);
                }
            } else {
                System.out.println("No files to parse");
                return;
            }
        }
    }
}
