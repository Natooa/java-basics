package functionpacket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class Test1 {

}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avdGrade;

    public Student(String name, char sex, int age, int course, double avdGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avdGrade = avdGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avdGrade=" + avdGrade +
                '}';
    }
}


class StudentInfo {
    void testStudents(ArrayList<Student> students, Predicate<Student> pr) {
        for (Student s : students) {
            if (pr.test(s)) {
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
        Student st1 = new Student("Ivanya", 'f', 22, 3, 8.3);
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


//        studentInfo.testStudents(students,s -> {return s.avdGrade > 8;});
//        studentInfo.testStudents(students,s -> {
//            System.out.println("Hello");
//            return s.avdGrade > 8;
//        });

//        Predicate<Student> p1 = student -> student.avdGrade > 7.5;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//        studentInfo.testStudents(students, p1.negate());


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


        Function<Student, Double> f = student -> student.avdGrade;
//        double res = avgOfSmth(students, stud -> stud.avdGrade);
        double res = avgOfSmth(students, stud -> (double)stud.age);
        System.out.println(res);

    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for(Student st : list) {
            result += f.apply(st);
        };
        result = result / list.size();
        return result;
    }

}

//interface StudentChecks {
//    boolean check(Student s);
//}

//class CheckOverGrade implements StudentChecks {
//    @Override
//    public boolean check(Student s) {
//        return s.avdGrade > 8;
//    }
//}