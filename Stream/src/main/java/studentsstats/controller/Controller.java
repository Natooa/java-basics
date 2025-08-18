package studentsstats.controller;

import java.sql.SQLOutput;
import java.util.Scanner;
import studentsstats.repository.StudentDB;
import studentsstats.manager.StudentManager;

public class Controller {
    private final Scanner scanner = new Scanner(System.in);
    private final StudentDB studentsDB = new StudentDB();
    private final StudentManager studentManager = new StudentManager(studentsDB);
    public void start(){
        while(true){
            System.out.println("Hello!" +
                    "\nWhat you wanna to do?");
            System.out.println("1. Add Student" +
                    "\n2. Delete Student" +
                    "\n3. Average grade of All Student" +
                    "\n4. See all students" +
                    "\n5. Exit");
            String choice = scanner.nextLine();
            switch(choice){
                case "1" -> {
                    studentsDB.addStudent();
                }
                case "2" -> {
                    System.out.println("Which student do you want to remove?");
                    System.out.print("Write ID: ");
                    studentsDB.deleteStudentByID(scanner.nextInt());
                    scanner.nextLine();
                }
                case "3" -> {
                    System.out.println("Here is the average grade of all students:");
                    studentManager.analyzStatsOfAllStudents();
                }
                case "4" -> {
                    studentsDB.returnMap().values().stream().forEach(System.out::println);
                }
                case "5" -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> {
                    throw new IllegalArgumentException("Invalid choice");
                }
            }
        }
    }
}
