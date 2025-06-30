package org.dayonetotwo.studentmanagerapp;

public class Course {
    private String courseName;
    private String courseCode;
    private String instructor;

    public Course(String courseName, String courseCode, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return "Course name: " + courseName + "\ncourseCode: " + courseCode + "\ninstructor: " + instructor;
    }
}
