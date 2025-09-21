package org.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptino1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("asdf");
        Scanner scanner = new Scanner(file);

    }
}
