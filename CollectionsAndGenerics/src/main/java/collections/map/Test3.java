package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Nurdiyar");
        students.put(2, "Zhasmin");
        students.put(3, "Zaur");
        System.out.println(students);

        Map<String, Integer> students2 = new HashMap<>();

        for(Map.Entry<Integer, String> entry : students.entrySet()) {
            students2.put(entry.getValue(), entry.getKey());
        }
        System.out.println(students2);
    }
}
