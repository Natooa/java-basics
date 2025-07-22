package generics;

import java.util.ArrayList;

public class Test1 <T>{
    private T t;

    Test1(T t) {
        this.t = t;
    }

    public void printTest1() {
        System.out.println(t);
    }
}

class Main1 {
    public static void main(String[] args) {
        Test1<Double> doubleTest1 = new Test1<>(2.0);
        Test1<Integer> integerTest1 = new Test1<>(2);
        Test1<String> stringTest1 = new Test1<>("Hello World!");

        doubleTest1.printTest1();
        integerTest1.printTest1();
        stringTest1.printTest1();

        System.out.println("---------------------");

        Student student1 = new Student("Nurdiyar", 19, 3);
        Test1<Student> studentTest1 = new Test1<>(student1);
        studentTest1.printTest1();

        System.out.println("---------------------");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(new Student("Zhasmin", 18, 2));
//        studentList.add(new Employee("Nurdiyar", 19, "it"));


        for(Student student : studentList){
            System.out.println(student);
            System.out.println("------------------------------");
        }
    }
}

class Student{
    private String name;
    private int age;
    private int courseOfStudy;

    public Student(String name, int age, int courseOfStudy) {
        if(name == null || age < 0 || courseOfStudy < 0){
            throw new IllegalArgumentException("student name or age or course error");
        }
        this.name = name;
        this.age = age;
        this.courseOfStudy = courseOfStudy;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " +  age + "\nCourseOfStudy: " + courseOfStudy;
    }
}

class Employee{
    private String name;
    private int age;
    private String department;
    public Employee(String name, int age, String department) {
        if(name == null || age < 0 || department == null){
            throw new IllegalArgumentException("name or age or department error");
        }
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nDepartment: " + department;
    }
}
