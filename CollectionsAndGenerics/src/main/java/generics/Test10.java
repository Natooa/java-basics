package generics;

import java.util.ArrayList;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        //List<Number> list = new ArrayList<Integer>();
        //List<Object> list1 = new ArrayList<Integer>();

        List<?> list = new ArrayList<String>();

        List<? extends Number> list3 = new ArrayList<Integer>();

        List<? super Number> list31 = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(1.0);
        list1.add(2.0);
        list1.add(3.0);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Bye");
        list2.add("Okay");
        showListInfo(list2);


        ArrayList<Integer> ald = new ArrayList<>();
        ald.add(3);
        ald.add(15);
        ald.add(12);
        System.out.println(summ(ald));


    }

    static void showListInfo(List<?> list) {
        System.out.println("My list has this objects: " + list);
    }

    public static double summ(ArrayList<? extends Number> list) {
        double sum = 0.0;
        for(Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
