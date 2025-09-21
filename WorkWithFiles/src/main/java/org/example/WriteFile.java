package org.example;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String text = "Hello world example";

        byte[] buffer = text.getBytes();

        try(FileOutputStream stream = new FileOutputStream("fileTest2.txt");){
            for(byte b : buffer){
                stream.write(b);
            }
        } catch (IOException e){
            System.out.println("Error");
        }
    }
}
