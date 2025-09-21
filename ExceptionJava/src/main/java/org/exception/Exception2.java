package org.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args)  {
//        File file = new File("asdh");
//        File file = new File("test");
//
//        try{
//            Scanner scanner = new Scanner(file);
//            System.out.println("After scanner");
//        } catch (FileNotFoundException e) {
////            e.printStackTrace(); console exception
//            System.out.println("File not found"); //print our message for exception
//        }
//
//        System.out.println("After block try catch");

//        readFile();

        try{
            readFile();
        }catch (FileNotFoundException e) {

            System.out.println("Handle exception in main method");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test");
//        File file = new File("asdf");
        Scanner scanner = new Scanner(file);
    }
}
