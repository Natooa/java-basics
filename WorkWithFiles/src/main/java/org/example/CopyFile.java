package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("fileTest2.txt")) {
            File directory = new File("src/main/java/org/folder");
            if(!directory.exists()){
                directory.mkdir();
            }
            try (FileOutputStream fos = new FileOutputStream("src/main/java/org/folder/fileTest2.txt")) {
                byte[] buffer = new byte[fis.available()];
                int len;
                while((len = fis.read(buffer)) != -1){
                    fos.write(buffer,0,len);
                }
            }catch (IOException e) {
                System.out.println("Output error");
            }
        }catch (IOException e){
            System.out.println("Input error");
        }
    }
}
