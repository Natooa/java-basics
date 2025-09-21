package org.example;

import java.io.*;

public class CloseFlow {
    public static void main(String[] args) {
        String text = "Some text for example";
        byte[] buffer = text.getBytes();

        //FileOutputStream stream = null;

        try(FileOutputStream stream = new FileOutputStream("file.txt");){
            //stream = new FileOutputStream("file.txt");
            for(byte b : buffer){
                stream.write(b);
            }
        } catch (IOException e) {
            System.out.println("input / output error");
        }// finally {
//            try{
//                if(stream != null){
//                    stream.close();
//                }
//            } catch (IOException e) {
//                System.out.println("close stream error");
//            }
//        }
    }
}
