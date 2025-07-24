package collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Nikolya", 2);
        Student st3 = new Student("Elena", 1);
        Student st4 = new Student("Petr", 4);
        Student st5 = new Student("Mariya", 3);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        System.out.println("LinkedList = " + studentLinkedList);

        System.out.println();

        System.out.println(studentLinkedList.get(2));

        System.out.println();

        Student st6 = new Student("Zaur", 3);
        Student st7 = new Student("Igor", 4);
        studentLinkedList.add(st6);
        System.out.println("LinkedList = " + studentLinkedList);
        studentLinkedList.add(1, st7);
        System.out.println("LinkedList = " + studentLinkedList);

        studentLinkedList.remove(3);
        System.out.println("LinkedList = " + studentLinkedList);



    }
}

class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        if(name == null || course < 0) {
            throw new IllegalArgumentException("incorrect data input");
        }
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [name = " + name + ", course = " + course + "]";
    }
}