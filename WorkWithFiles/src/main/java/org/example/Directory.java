package org.example;

import java.io.*;

public class Directory {
    public static void main(String[] args) {
//        File directory = new File("src/backup");
//        if(!directory.exists()){
//            System.out.println(directory.mkdir() ? "created" : "not created");
//        } else{
//            System.out.println("Already exists");
//        }

//        System.out.println(directory.delete() ? "deleted" : "not deleted");

        String path = "src/main/java/org/backup";
        File directory = new File(path);
//        if(!directory.exists()){
//            System.out.println(directory.mkdir() ? "created" : "not created");
//        } else{
//            System.out.println("Already exists");
//        }
        if(directory.isDirectory()) {
            String[] content = directory.list();
            if(content != null) {
                for (String each : content) {
                    File file = new File(path + "/" + each);
                    System.out.println(file.isDirectory() ? (each + " is directory") : (each + " is file"));
                }
            }
        }
    }
}
