package org;

import java.util.*;
import java.util.stream.Collectors;

public class TestMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("how are you");
        list.add("ok");
        list.add("bye");

//        for(int i = 0; i < list.size(); i++){
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

        List<Integer> list2 = list.stream().map(element -> element.length())
                .collect(Collectors.toList());

        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element ->
        {
            if(element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();

//        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("hello");
        set.add("how are you");
        set.add("ok");
        set.add("bye");

        System.out.println(set);
        List<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(set2);
    }
}
