package org.dayonetotwo.studentmanagerapp;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nurdiyar", 19, "37308", "male");
        Course courseOfStudent1 = new Course("Calculus2", "calc1001", "MIT");
        Enrollment enrollment1 = new Enrollment(student1, courseOfStudent1);
        System.out.println(enrollment1.toString());

        System.out.println();

        Student student2 = new Student("Zhasmin", 18, "25044", "female");
        Course courseOfStudent2 = new Course("Calculus2", "calc1002", "Harvard");
        Enrollment enrollment2 = new Enrollment(student2, courseOfStudent2);
        System.out.println(enrollment2.toString());

    }
}
