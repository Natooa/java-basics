package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Objects;

public class SubPart2OfPart1 {
    public static void main(String[] args) {
        Student st1 = new Student("Nurdiyar", 'm', 19, 3, 3.06);
        Student st2 = new Student("Zhasmin", 'f', 18, 2, 3.5);
        Student st3 = new Student("Zaur", 'm', 20, 4, 3.2);
        Student st4 = new Student("Masha", 'f', 19, 3, 3);
        Student st5 = new Student("Misha", 'm', 18, 1, 2.89);

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);

        Student st6 = new Student("Misha", 'm', 18, 1, 2.89);
//        studentList.remove(st6);
        int index = studentList.indexOf(st6);
        System.out.println(index);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        if(name == null || (sex != 'f' && sex != 'm') || age < 0 || avgGrade < 0 || course < 0 || avgGrade > 100 ) {
            throw new IllegalArgumentException("sorry incorrect data");
        }

        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student name: " +
                name + "\nSex: " +
                sex  + "\nAge: " +
                age + "\nCourse: " +
                course +  "\nAvgGrade: " +
                avgGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(avgGrade, student.avgGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }
}
