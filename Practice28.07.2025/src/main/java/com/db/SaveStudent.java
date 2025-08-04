package com.db;

import com.studentmanager.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveStudent {
//    private final ArrayList<Student> students = new ArrayList<>();
    private final Map<Integer, Student> students = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Name of Student: ");
        String name = scanner.nextLine();

        System.out.println("Age of Student: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Course of student: ");
        int course =  scanner.nextInt();
        scanner.nextLine();

        try {
            Student student = new Student(name, age, course);
            students.put(student.getID(), student);
            System.out.println("Student added successfully!");
            System.out.println("ID of Student: " + student.getID() + " Name of student: " + student.getName() + " Age of student: " + student.getAge() + " Course of student: " + student.getCourse());
        } catch (IllegalArgumentException e){
            System.out.println("Student not added successfully!" +  e.getMessage());
        }
    }

    public Student searchStudentByID(int ID) {
        if(students.isEmpty()) {
            System.out.println("Student list is empty!");
            throw new IllegalArgumentException("Student list is empty!");
        }
        if(students.containsKey(ID)) {
            return students.get(ID);
        } else {
            System.out.println("Student with ID " + ID + " not found!");
            return null;
        }
//        boolean found = false;
//        for (Student student : students) {
//            if (student.getID() == ID) {
//                found = true;
//                return found;
//            }
//        }
//        System.out.println("Student with ID " + ID + " not found");
//        return false;
    }

    public void printStudentByID(int ID) {
        if(students.isEmpty()) {
            System.out.println("Student list is empty!");
            throw new IllegalArgumentException("Student list is empty!");
        }
        Student found =  searchStudentByID(ID);
        if(found != null) {
            System.out.println(found.toString());
        } else {
            throw new RuntimeException("Student with ID " + ID + " not found");
        }
    }

    public void printStudentList() {
        if(students.isEmpty()) {
            throw new IllegalArgumentException("Student list is empty!");
        } else {
            for(Map.Entry<Integer, Student> entry : students.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue().toString());
            }
        }
    }

    public void deleteStudentByID(int ID) {
        Student found = searchStudentByID(ID);
        if(found != null) {
            students.remove(ID);
        } else {
            throw new IllegalArgumentException("Student with ID " + ID + " not found");
        }
    }

    public void changeStudentDataByID(int ID) {
        Student found = searchStudentByID(ID);
        if(found != null) {
            while (true) {
                System.out.println("What you want to change?");
                System.out.println("1. Name \n2. Age \n3. Course \n4. Exit");
                System.out.print("Choice: ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1" -> {
                        System.out.println("New name: ");
                        found.changeName(scanner.nextLine());
                    }
                    case "2" -> {
                        System.out.println("New age: ");
                        int age = scanner.nextInt();
                        found.changeAge(age);
                        scanner.nextLine();
                    }
                    case "3" -> {
                        System.out.println("New course: ");
                        int course = scanner.nextInt();
                        found.changeCourse(course);
                        scanner.nextLine();
                    }
                    case "4" -> {
                        System.out.println("Exit");
                        return;
                    }
                    default -> {
                        System.out.println("Invalid Choice");
                    }
                }
            }
        }
    }
}
