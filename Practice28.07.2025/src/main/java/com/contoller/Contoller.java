package com.contoller;

import com.db.SaveStudent;
import com.studentmanager.Student;

import java.util.Scanner;

public class Contoller {
    private final Scanner scanner = new Scanner(System.in);
    private final SaveStudent saveStudent = new SaveStudent();
    public void start() {
        System.out.println("Hello its Student manager!");
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add Student \n2. Delete Student \n3. Update Student \n4. Find Student \n5. Print All Students \n6. Exit");
            System.out.println("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> saveStudent.addStudent();
                case "2" -> {
                    System.out.println("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    saveStudent.deleteStudentByID(id);
                }
                case "3" -> {
                    System.out.println("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    saveStudent.changeStudentDataByID(id);
                }
                case "4" -> {
                    System.out.println("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    saveStudent.printStudentByID(id);
                }
                case "5" -> {
                    saveStudent.printStudentList();
                }
                case "6" -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}
