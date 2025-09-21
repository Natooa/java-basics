package org.example;

import java.io.*;

public class ClassFile {
    public static void main(String[] args) {
        String path = "/home/natooa/IdeaProjects/java-basics/WorkWithFiles/sample.txt";
        File file = new File(path);

        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());

        System.out.println();

        System.out.println("Parent directory: " + file.getParent());
        System.out.println("File size: " + file.length());

        System.out.println();

        System.out.println((file.exists() ? "File exists" : "File doesn't exist"));
        System.out.println("File: " + (file.canWrite() ? "Writable" : "not writeable"));
        System.out.println("File: " + (file.canRead() ? "Readable" : "not readable"));
        System.out.println("File: " + (file.isDirectory() ? "Directory" : "not directory"));
        System.out.println("File: " + (file.isFile() ? "File is regular" : "not file is regular"));
        System.out.println("File: " + (file.isHidden() ? "Hidden" : "not hidden"));

        System.out.println();

        System.out.println("Total space: " + CapacityFormatter.toGigabytes(file.getTotalSpace()) + "Gb");
        System.out.println("Free space: " +  CapacityFormatter.toGigabytes(file.getFreeSpace()) + "Gb");

        File newName = new File("/home/natooa/IdeaProjects/java-basics/WorkWithFiles/test.txt");
        System.out.println("Rename: " + (file.renameTo(newName) ? "renamed" : "not renamed"));
        File newName2 = new File("/home/natooa/IdeaProjects/java-basics/WorkWithFiles/test-sample.txt");
        System.out.println("Rename second time: " + (newName.renameTo(newName2) ? "renamed" : "not renamed"));

//        but i wont do function below but it returned true
//        System.out.println("Delete file: " + (file.delete() ? "deleted" : "not deleted"));
    }

    private static class CapacityFormatter{
        private static long toGigabytes(long capacity) {
            return capacity / (long)Math.pow(10,9);
        }
    }
}
