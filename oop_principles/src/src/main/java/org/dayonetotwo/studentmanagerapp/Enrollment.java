package org.dayonetotwo.studentmanagerapp;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    private Student student;
    private Course course;

    private static List<Enrollment> enrollments = new ArrayList<>();

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        enrollments.add(this);
    }

    public static List<Enrollment> getAllEnrollments() {
        return enrollments;
    }

    public Student getStudent() {
        return student;
    }
    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student: \n" + student + "\nCourse: \n" + course;
    }
}
