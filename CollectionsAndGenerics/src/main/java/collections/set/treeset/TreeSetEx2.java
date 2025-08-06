package collections.set.treeset;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeset = new TreeSet<>();
        Student st1 = new Student("Nurdiyar", 5);
        Student st2 = new Student("Michael", 1);
        Student st3 = new Student("Juan", 2);
        Student st4 = new Student("John", 3);
        Student st5 = new Student("James", 4);
        treeset.add(st1);
        treeset.add(st2);
        treeset.add(st3);
        treeset.add(st4);
        treeset.add(st5);
        System.out.println(treeset);

        System.out.println(treeset.first());
        System.out.println(treeset.last());

        Student st6 = new Student("Oleg", 2);
        Student st7 = new Student("Ivan", 4);
        System.out.println(treeset.headSet(st6));
        System.out.println(treeset.tailSet(st6));
        System.out.println(treeset.subSet(st6, st7));

        System.out.println(st3.equals(st3));
        System.out.println(st3.hashCode() == st6.hashCode());


    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student o) {
        return this.course -  o.course;
    }
}
