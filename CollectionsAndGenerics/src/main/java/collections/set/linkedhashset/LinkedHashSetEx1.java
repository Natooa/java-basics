package collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        linkedHashSet.add(10);
        System.out.println(linkedHashSet);

        linkedHashSet.remove(8);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains(10));

    }
}
