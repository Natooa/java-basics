package collectionspractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for(String s1 : split){
            map.put(s1, map.getOrDefault(s1, 0) + 1);
        }

        System.out.println(map);
    }
}
