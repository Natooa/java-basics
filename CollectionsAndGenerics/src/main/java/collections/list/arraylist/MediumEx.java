package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediumEx {
    public static void main(String[] args) {
        ArrayList<Integer> numberArrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 10, 34, 12, 9, 8));

//        for(int i = 0; i < numberArrayList.size(); i++) {
//            if(numberArrayList.get(i) % 2 == 0) {
//                numberArrayList.remove(i);
//            }
//        }

        Iterator<Integer> iteratorInteger = numberArrayList.iterator();
        while(iteratorInteger.hasNext()) {
            Integer integer = iteratorInteger.next();
            if(integer % 2 == 0) {
                iteratorInteger.remove();
            } else {
                System.out.print(integer + " ");
            }
        }

//        for(int j = 0; j < numberArrayList.size(); j++) {
//            System.out.print(numberArrayList.get(j) + " ");
//        }

        System.out.println();

        ArrayList<String> nameArrayList = new ArrayList<>();
        nameArrayList.add("Nurdiyar");
        nameArrayList.add("Zhasmin");
        nameArrayList.add("Ailuna");
        nameArrayList.add("Aliya");
        nameArrayList.add("Nurdiyar");
        nameArrayList.add("Bolatzhan");

        for(int i = 0; i < nameArrayList.size() - 1; i++) {
            for(int j = i + 1; j < nameArrayList.size(); j++) {
                if(nameArrayList.get(i).equals(nameArrayList.get(j))) {
                    nameArrayList.remove(j);
                }
            }
        }
        for(int j = 0; j < nameArrayList.size(); j++) {
            System.out.print(nameArrayList.get(j) + " ");
        }

        System.out.println();

        ArrayList<Integer> numberArrayList1 = new ArrayList<>(List.of(2, 4, 6, 8, 10));
        numberArrayList.addAll(numberArrayList1);

        for(Integer integer : numberArrayList) {
            System.out.print(integer + " ");
        }

        System.out.println();

        Integer temp = numberArrayList.get(0);
        numberArrayList.set(0, numberArrayList.get(numberArrayList.size() - 1));
        numberArrayList.set(numberArrayList.size() - 1, temp);
        for(Integer integer : numberArrayList) {
            System.out.print(integer + " ");
        }
    }
}
