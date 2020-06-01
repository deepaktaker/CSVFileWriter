package com.csv.writer.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter bufWrite = new BufferedWriter(new FileWriter("Data.csv"));) {
            bufWrite.write("Name,Dept,Salary\n");
            bufWrite.write("Deep,CPI,12000");
            bufWrite.flush();
            bufWrite.close();
            System.out.println("Done Writing File");
        }
    }

}
