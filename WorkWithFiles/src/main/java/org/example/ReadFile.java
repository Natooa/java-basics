package org.example;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        //if file located in another place we gotta use full path for file
        try(FileInputStream stream = new FileInputStream("fileTest2.txt");){
            int symbol;
            while((symbol = stream.read()) != -1) {
                System.out.print((char)symbol);
            }
        }catch(IOException e){
            System.out.println("Input error");
        }
    }
}
