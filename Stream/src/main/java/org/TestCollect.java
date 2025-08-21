package org;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollect {
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

//        Map<Integer, List<Student>> map = students.stream().map(element -> {
//            element.setName(element.getName().toUpperCase());
//            return element;
//        })
//                .collect(Collectors.groupingBy(el -> el.getCourse()));
//
//        for(Map.Entry<Integer, List<Student>> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue().toString());
//        }

        Map<Boolean, List<Student>> map =
                students.stream()
                        .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));

        for(Map.Entry<Boolean, List<Student>> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue().toString());
        }
    }
}
