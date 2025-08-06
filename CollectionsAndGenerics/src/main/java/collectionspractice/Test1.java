package collectionspractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        Set<String> set = new HashSet<>();
        for (String s : arr) {
            s = s.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
            set.add(s);
        }
        for(String s: set){
            System.out.println(s);
        }

    }
}
