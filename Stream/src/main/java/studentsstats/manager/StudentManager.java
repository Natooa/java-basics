package studentsstats.manager;

import studentsstats.repository.StudentDB;
import studentsstats.entity.Students;
import static studentsstats.repository.StudentDB.checkIfStudentIsEmpty;

import java.util.HashMap;

public class StudentManager {
    private StudentDB db = new StudentDB();
    public StudentManager(StudentDB db) {
        this.db = db;
    }

    public void analyzStatsOfAllStudents() {
        checkIfStudentIsEmpty();
        HashMap<Integer, Students> mapStudents = db.returnMap();
        double avgValue =  mapStudents.values().stream()
                .map(students -> students.getAvgGrade())
                .reduce(0.0,(acc, stud) -> acc + stud);
        int count = mapStudents.size();
        double avgGrade = avgValue / count;
        System.out.println(avgGrade);
    }
}
