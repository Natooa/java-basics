package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Nurdiyar", "+112312313");
        phoneBook.put("Zhasmin", "+12133131");
        phoneBook.put("Zaur", "+12313131");

        System.out.println(phoneBook.get("Nurdiyar"));

        System.out.println(phoneBook.containsKey("Zaur"));
        System.out.println(phoneBook);
        phoneBook.remove("Zaur");
        System.out.println(phoneBook);


    }
}
