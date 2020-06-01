package com.csv.writer.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CSVWriter {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Data.csv");
        if (args != null && args.length > 0) {
            path = Paths.get(args[0] + System.lineSeparator() + path.toString());
        }
        System.out.println("Path that is set :" + path);
        try (BufferedWriter bufWrite = new BufferedWriter(new FileWriter("src/main/resources/Data.csv"));) {
            bufWrite.write("Name,Dept,Salary\n");
            bufWrite.write("Deep,CPI,12000");
            bufWrite.flush();
            bufWrite.close();
            System.out.println("Done Writing File");
        }
    }

}
