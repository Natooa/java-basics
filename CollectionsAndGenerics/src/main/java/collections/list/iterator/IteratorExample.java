package collections.list.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        Iterator<String> iterator = arrayList1.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().equals("Ivan")) {
                iterator.remove();
            }
        }

        System.out.println(arrayList1);
    }
}
