package org.example;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("output.txt")) {
            int symbol;
            while ((symbol = fr.read()) != -1) {
                System.out.print((char)symbol);
            }
        } catch (IOException e) {
            System.out.println("input error");
        }
    }
}
