package org.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception5 {
    public static void main(String[] args) {
        //checked Exception (Compile time exception) = исключительные случаи

        File file = new File("asdf");
        try{
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
