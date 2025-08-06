package collections.map.linkedhashmap;

import javax.management.MBeanAttributeInfo;
import java.util.LinkedHashMap;
import java.util.Objects;

public class LinkedHashMapEx1 {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Nurdiyar", "Seitnurov", 3);
        Student st3 = new Student("Zhasmin", "Makulbekova", 2);
        Student st4 = new Student("Igor", "Tregulov", 3);

        linkedHashMap.put(7.2, st3);
        linkedHashMap.put(7.5, st4);
        linkedHashMap.put(5.8, st1);
        linkedHashMap.put(6.4, st2);
        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(6.4));
        System.out.println(linkedHashMap.get(7.5));

        System.out.println(linkedHashMap);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}


