package org;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
//        System.out.println(result);

        int result2 = list.stream().reduce(1, (accumulator, element) ->
                accumulator * element);
//        System.out.println(result2);

        List<String> list3 = new ArrayList<>();
        list3.add("hello");
        list3.add("ok");
        list3.add("how are u?");
        list3.add("bye");

        String concat = list3.stream().reduce((accumulator, element) ->
                accumulator + " " + element).get();
        System.out.println(concat);

//        List<Integer> list100 =  new ArrayList<>();
//        Optional<Integer> o = list.stream().reduce((accumulator, element) ->
//                accumulator * element);
//        if(o.isPresent()){
//            System.out.println(o.get());
//        } else {
//            System.out.println("Not present");
//        }
//        System.out.println(result100);

    }
}
