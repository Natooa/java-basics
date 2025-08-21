package org;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMapToInt {
    public static void main(String[] args) {
        Student st1 = new Student("Nurdiyar", 'm', 19, 3, 9.0);
        Student st2 = new Student("Zhasmin", 'f', 18, 2, 9.5);
        Student st3 = new Student("Elena", 'f', 28, 1, 8.8);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Zaur", 'm', 23, 3, 7.4);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Integer> courses = students.stream().mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(courses);

        List<Double> avgGrade = students.stream()
                .mapToDouble(el -> el.getAvgGrade())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(avgGrade);

        int sum = students.stream()
                .mapToInt(el -> el.getCourse())
                .sum();
        System.out.println(sum);

        double avg = students.stream()
                .mapToInt(el -> el.getCourse())
                .average().getAsDouble();
        System.out.println(avg);

        int min = students.stream()
                .mapToInt(el -> el.getCourse())
                .min().getAsInt();
        System.out.println(min);

        int max = students.stream()
                .mapToInt(el -> el.getCourse())
                .max().getAsInt();
        System.out.println(max);
    }
}
