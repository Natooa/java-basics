package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {
    void testStudents(ArrayList<Student> students, StudentChecks sc) {
        for (Student s : students) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
//    void printStudentsOverGrade(ArrayList<Student> students, double grade) {
//        for(Student student : students) {
//            if(student.avdGrade > grade) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudetsUnderAge(ArrayList<Student> students, int age) {
//        for(Student student : students) {
//            if(student.age < age) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> students, int age, double grade, char sex) {
//        for(Student student : students) {
//            if(student.age > age && student.avdGrade < grade && student.sex == sex) {
//                System.out.println(student);
//            }
//        }
//    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nurdiyar", 'm', 19, 3, 9.5);
        Student st3 = new Student("Zhasmin", 'f', 21, 2, 7.4);
        Student st4 = new Student("John", 'm', 20, 1, 4.5);
        Student st5 = new Student("Michael", 'm', 21, 4, 8.4);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo studentInfo = new StudentInfo();

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course -  o2.course;
//            }
//        });
//        System.out.println(students);

        Collections.sort(students, (stud1, stud2) -> stud1.course - stud2.course);
        System.out.println(students);

//        studentInfo.testStudents(students, new CheckOverGrade());

//        studentInfo.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 20;
//            }
//        });

        //type of lambda expression
//        studentInfo.testStudents(students, (Student s) -> {return s.avdGrade > 8;});
//        studentInfo.testStudents(students, s -> s.avdGrade > 8);
//        studentInfo.testStudents(students, (Student s) -> s.avdGrade > 8);
//        studentInfo.testStudents(students,s -> {return s.avdGrade > 8;});
//        studentInfo.testStudents(students,s -> {
//            System.out.println("Hello");
//            return s.avdGrade > 8;
//        });
//
//        StudentChecks cs = (Student s) -> {return s.avdGrade > 8;};
//        studentInfo.testStudents(students, cs);
//
//
//        System.out.println("---------------------------------");
//
//        studentInfo.testStudents(students, (Student s) -> {
//            return s.age < 20;
//        });
//
//        System.out.println("---------------------------------");
//        studentInfo.testStudents(students, (Student s) -> {
//            return s.age > 20 && s.avdGrade > 9.3 && s.sex == 'f';
//        });
//

//        studentInfo.printStudentsOverGrade(students, 8);
//        System.out.println("---------------------");
//        studentInfo.printStudetsUnderAge(students, 20);
//        System.out.println("---------------------");
//        studentInfo.printStudentsMixCondition(students, 20, 9, 'f');


    }
}

interface StudentChecks {
    boolean check(Student s);
}

//class CheckOverGrade implements StudentChecks {
//    @Override
//    public boolean check(Student s) {
//        return s.avdGrade > 8;
//    }
//}
