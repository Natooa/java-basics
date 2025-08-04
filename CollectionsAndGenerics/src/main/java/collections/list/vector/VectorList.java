package collections.list.vector;

import java.util.Vector;

public class VectorList {
    public static void main(String[] args) {
        Vector<String> v1 = new  Vector<String>();
        v1.add("Zaur");
        v1.add("David");
        v1.add("Robin");
        v1.add("Patricia");
        System.out.println(v1);
        System.out.println(v1.firstElement());
        System.out.println(v1.lastElement());
        v1.remove(2);
        System.out.println(v1);
        System.out.println(v1.get(1));
    }
}
