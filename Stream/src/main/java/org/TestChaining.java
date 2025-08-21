package org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestChaining {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        int result = Arrays.stream(array).filter(x -> x % 2 != 0)
                .map(x -> {
                    if (x % 3 == 0) {
                        x = x / 3;
                    }
                    return x;
                })
                .reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);

//        Student st1 = new Student("Nurdiyar", 'm', 19, 3, 9.0);
//        Student st2 = new Student("Zhasmin", 'f', 18, 2, 9.5);
//        Student st3 = new Student("Elena", 'f', 28, 1, 8.8);
//        Student st4 = new Student("Petr", 'm', 35, 4, 7);
//        Student st5 = new Student("Zaur", 'm', 23, 3, 7.4);

//        List<Student> students = new ArrayList<>();
//        students.add(st1);
//        students.add(st2);
//        students.add(st3);
//        students.add(st4);
//        students.add(st5);
//
//        students.stream().map(element -> {
//            element.setName(element.getName().toUpperCase());
//            return element;
//        })
//                .filter(element -> element.getSex() == 'f')
//                .sorted((x, y) -> x.getAge() -  y.getAge())
//                .forEach(element -> System.out.println(element));

    }
}

//class Student {
//    private String name;
//    private char sex;
//    private int age;
//    private int course;
//    private double avgGrade;
//
//    public Student(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", sex=" + sex +
//                ", age=" + age +
//                ", course=" + course +
//                ", avgGrade=" + avgGrade +
//                '}';
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public char getSex() {
//        return sex;
//    }
//
//    public void setSex(char sex) {
//        this.sex = sex;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getCourse() {
//        return course;
//    }
//
//    public void setCourse(int course) {
//        this.course = course;
//    }
//
//    public double getAvgGrade() {
//        return avgGrade;
//    }
//
//    public void setAvgGrade(double avgGrade) {
//        this.avgGrade = avgGrade;
//    }
//}
//
