package collectionspractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        LinkedList<Integer> list2 = new LinkedList<>();

        long startArrayList = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            list.add(i);
        }
        long endArrayList = System.currentTimeMillis();
        System.out.println("Time of exec: " + (endArrayList - startArrayList) + " milliseconds");

        long startLinkedList = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            list2.add(i);
        }
        long endLinkedList = System.currentTimeMillis();
        System.out.println("Time of exec: " + (endLinkedList - startLinkedList) + " milliseconds");

        HashMap<Integer, Integer> map = new HashMap<>();
        long startHashMap = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            map.put(i,i);
        }
        long endHashMap = System.currentTimeMillis();
        System.out.println("Time of exec: " + (endHashMap - startHashMap) + " milliseconds");
    }
}
