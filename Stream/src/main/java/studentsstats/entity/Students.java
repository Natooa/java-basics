package studentsstats.entity;

import java.util.Objects;

public class Students {
    private final Integer ID;
    private String name;
    private String surname;
    private int age;
    private int course;
    private double avgGrade;

    private static Integer countStudent = 1;

    public Students(String name, String surname, int age, int course, double avgGrade) {
        this.ID = countStudent++;

        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty");
        }
        if(surname == null || surname.trim().isEmpty()) {
            throw new IllegalArgumentException("Student surname cannot be null or empty");
        }
        if(age < 0 || age > 100) {
            throw new IllegalArgumentException("Student age must be between 0 and 100");
        }
        if(course < 0 && course > 4) {
            throw new IllegalArgumentException("Student course must be between 1 and 4");
        }
        if(avgGrade < 0.0 || avgGrade > 4.0) {
            throw new IllegalArgumentException("Student avgGrade must be between 0.0 and 4.0");
        }

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public static int getCountStudent() {
        return countStudent;
    }

    //change methods

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty");
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if(surname == null || surname.trim().isEmpty()) {
            throw new IllegalArgumentException("Student surname cannot be null or empty");
        }
        this.surname = surname;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            throw new IllegalArgumentException("Student age must be between 0 and 100");
        }
        this.age = age;
    }

    public void setCourse(int course) {
        if(course < 0 || course > 4) {
            throw new IllegalArgumentException("Student course must be between 0 and 4");
        }
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
        if(avgGrade < 0 || avgGrade > 4.0) {
            throw new IllegalArgumentException("Student avgGrade must be between 0.0 and 4.0");
        }
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(ID, students.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }
}
