package studentsstats.repository;

import java.util.HashMap;
import java.util.Scanner;

import studentsstats.entity.Students;

public class StudentDB {
    public static final HashMap<Integer, Students> studentsDB = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Adding student\nWhat is name of student?: ");
        String name = scanner.nextLine();
        System.out.print("\nAdding surname of student?: ");
        String surname = scanner.nextLine();
        System.out.print("\nAdding student age: ");
        String age = scanner.nextLine();
        System.out.print("\nAdding student course: ");
        String course = scanner.nextLine();
        System.out.print("\nAdding student avg Grade: ");
        String avgGrade = scanner.nextLine();

        Students st = new Students(name, surname, Integer.parseInt(age), Integer.parseInt(course), Double.parseDouble(avgGrade));
        studentsDB.put(st.getID(), st);
    }

    public void deleteStudentByID(int ID) {
        checkIfStudentIsEmpty();
        studentsDB.entrySet().removeIf(entry -> entry.getValue().getID() == ID);
    }

    public Students getStudentByID(int ID) {
        checkIfStudentIsEmpty();
        return studentsDB.values().stream()
                .filter(students -> students.getID() == ID)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Student with ID " + ID + " not found"));
    }

    public static void checkIfStudentIsEmpty() {
        if(studentsDB.isEmpty()) {
            throw new IllegalArgumentException("Sorry list of students is empty");
        }
    }

    public HashMap<Integer, Students> returnMap() {
        checkIfStudentIsEmpty();
        return new HashMap<>(studentsDB);
    }
}
