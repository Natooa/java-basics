package collections.map.hashtable;

import java.util.Hashtable;
import java.util.Objects;

public class HashTableEx1 {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashtable = new Hashtable<>();

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Nurdiyar", "Seitnurov", 3);
        Student st3 = new Student("Zhasmin", "Makulbekova", 2);
        Student st4 = new Student("Igor", "Tregulov", 3);

        hashtable.put(7.8, st1);
        hashtable.put(9.3, st2);
        hashtable.put(5.8, st3);
        hashtable.put(6.0, st4);

        //cant be put null key and value
        //sync
        System.out.println(hashtable);
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



