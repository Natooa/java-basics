package org.dayonetotwo.studentmanagerapp;

public class Enrollment {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
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
