package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        //ArrayList arrayList1 = new ArrayList();
        //int i = arrayList1.get(0);
        //int i = (integer)arrayList1.get(0);




        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        int a = GenMethod.getSecondElement(arrayList1);
        System.out.println(a);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("a");
        arrayList2.add("b");
        arrayList2.add("c");
        String b = GenMethod.getSecondElement(arrayList2);
        System.out.println(b);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}
