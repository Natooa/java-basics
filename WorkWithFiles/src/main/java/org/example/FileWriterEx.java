package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        String text = "Some text like Hello World";
        char[] chars = text.toCharArray();
        text.getChars(0,text.length(),chars,0);

        try(FileWriter fw = new FileWriter("output.txt")){
            for(char c : chars){
                fw.write(c);
            }
        } catch (IOException e){
            System.out.println("Output error");
        }
    }
}
