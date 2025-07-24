package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleEx {
    public static void main(String[] args) {
        ArrayList<Integer> numberArrayList = new ArrayList<>();
        numberArrayList.add(1);
        numberArrayList.add(2);
        numberArrayList.add(3);
        numberArrayList.add(4);
        numberArrayList.add(5);

        for(Integer integer : numberArrayList) {
            System.out.print(integer + " ");
        }

        System.out.println();

        numberArrayList.remove(2);
        for(Integer integer : numberArrayList) {
            System.out.print(integer + " ");
        }

        System.out.println();

        for(int i = 0; i < numberArrayList.size(); i++) {
            if(numberArrayList.get(i) == 4) {
                numberArrayList.remove(i);
                i--;
            }
        }

        for(Integer integer : numberArrayList) {
            System.out.print(integer + " ");
        }

        System.out.println();
        Iterator<Integer> iteratorInt = numberArrayList.iterator();
        while(iteratorInt.hasNext()) {
            Integer intNum = iteratorInt.next();
            if(intNum == 2) {
                iteratorInt.remove();
            } else {
                System.out.print(intNum + " ");
            }
        }

        System.out.println();

        ArrayList<Integer> numberArrayList2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, -1, 7, 8, 9, 10));
        int max = numberArrayList2.get(0);
        int min = numberArrayList2.get(0);
        for(int i = 1; i < numberArrayList2.size(); i++) {
            if(numberArrayList2.get(i) > max) {
                max = numberArrayList2.get(i);
            }
            if(numberArrayList2.get(i) < min) {
                min = numberArrayList2.get(i);
            }
        }

        for(Integer integer : numberArrayList2) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("Min: " + min +  " Max: " + max);

        int count = 0;
        for(int i = 0; i < numberArrayList2.size(); i++) {
            count += numberArrayList2.get(i);
        }
        System.out.println("Count: " + count);

        ArrayList<String> nameArrayList = new ArrayList<>(List.of("Nurdiyar", "Zhasmin", "Ailuna", "Abilkhan", "Bolatzhan", "Aliya"));
        for(int i = 0; i < nameArrayList.size() - 1; i++) {
            for(int j = 0; j < nameArrayList.size() -1 - i; j++) {
                if(nameArrayList.get(j).compareTo(nameArrayList.get(j + 1)) > 0) {
                    String temp = nameArrayList.get(j);
                    nameArrayList.set(j, nameArrayList.get(j + 1));
                    nameArrayList.set(j + 1, temp);
                }
            }
        }
        System.out.println(nameArrayList.toString());
    }

}
