package org.dayonetotwo.studentmanagerapp;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String id;
    private String gender;

    public Student(String name, int age, String id, String gender) {
        if(age <= 0 || age >= 80) {
            throw new IllegalArgumentException("age must be between 0 and 80");
        }
        if(id == null || id.length() != 5) {
            throw new IllegalArgumentException("id must be 5 digits");
        }
        if(!gender.equals("male") && !gender.equals("female")) {
            throw new IllegalArgumentException("gender must be male/female");
        }
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getId(){
        return id;
    }

    public int  getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\ngender: " +  gender + "\nid: " + id;
    }
}