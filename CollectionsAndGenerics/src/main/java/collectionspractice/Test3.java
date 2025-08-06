package collectionspractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        Student st1 = new Student("Nurdiyar", 3);
        Student st2 = new Student("Zhasmin", 4);
        Student st3 = new Student("John", 1);
        Student st4 = new Student("James", 2);
        Student st5 = new Student("Elizabet", 5);

        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        Collections.sort(list, new GradeComparator());
        for(Student s: list){
            System.out.println(s);
        }
    }
}

class Student{
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

class GradeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.grade - o2.grade;
    }
}
