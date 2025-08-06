package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 =new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(1341, "Ivan Ivanov");
        map1.put(5423, "Mariya Sidorova");
        map1.put(131231, "Nikolya Petrov");
        map1.putIfAbsent(1000, "Oleg Ivanov");
        System.out.println(map1);
        //System.out.println(map1.get(1000));
        map1.remove(131231);
        System.out.println(map1);

//        System.out.println(map1.containsValue("Oleg Ivanov"));
//        System.out.println(map1.containsKey(1000));

        System.out.println(map1.keySet());
        System.out.println(map1.values());


    }
}
