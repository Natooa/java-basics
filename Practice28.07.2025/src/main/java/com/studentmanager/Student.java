package com.studentmanager;

import java.util.Objects;

public class Student {
    //fields of Class
    private final int ID;
    private String name;
    private int age;
    private int course;
    private static int countOfStudent = 0;

    //constructor
    public Student(String name, int age, int course) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name is null or empty");
        }
        if(age < 0 || age > 60) {
            throw new IllegalArgumentException("Student age is out of range");
        }
        if(course < 0 || course > 5) {
            throw new IllegalArgumentException("Course is out of range");
        }

        this.ID = countOfStudent++;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    //getters snd setters
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }
    private void setCourse(int course) {
        this.course = course;
    }

    //toString for beautiful print
    @Override
    public String toString() {
        return "Student ID: " + ID +
                "\nStudent Name: " + name +
                "\nStudent Age: " + age +
                "\nStudent Course: " + course;
    }

    // Equals and HashCode methods for comparing students
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }

    //change methods
    public void changeName(String newName) {
        if(newName == null || newName.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name is null or empty");
        }
        setName(newName);
    }

    public void changeAge(int newAge) {
        if(newAge < 0 || newAge > 60) {
            throw new IllegalArgumentException("Student age is out of range");
        }
        setAge(newAge);
    }

    public void changeCourse(int newCourse) {
        if(newCourse < 0 || newCourse > 5) {
            throw new IllegalArgumentException("Course is out of range");
        }
        setCourse(newCourse);
    }
}
