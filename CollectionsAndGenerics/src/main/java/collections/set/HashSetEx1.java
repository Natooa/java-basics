package collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Daniel");
        set.add("Michael");

        set.remove("Zaur");
//        System.out.println(set);
        for(String s : set) {
            System.out.println(s);
        }

        System.out.println(set.size());
        System.out.println(set.isEmpty());

        System.out.println(set.contains("Daniel"));

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(2);
        set2.add(3);
        set2.add(1);
        set2.add(8);

        HashSet<Integer> set3 = new HashSet<>();
        set3.add(7);
        set3.add(4);
        set3.add(3);
        set3.add(5);
        set3.add(8);

        HashSet<Integer> union = new HashSet<>(set2);
        union.addAll(set3);
        System.out.println(union);

        HashSet<Integer> intersection = new HashSet<>(set2);
        intersection.retainAll(set3);
        System.out.println(intersection);

        HashSet<Integer> difference = new HashSet<>(set2);
        difference.removeAll(set3);
        System.out.println(difference);

    }
}
