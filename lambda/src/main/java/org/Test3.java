package org;

public class Test3 {
    static void def(O o) {
        System.out.println(o.abc("hello"));
    }

    public static void main(String[] args) {
        final int i = 10; //or if iffectivle final
//        i = 15;
        def((String s) -> {
            int a = 5;
            System.out.println(i);
            return s.length();
        });
//        i = 15;

    }
}

interface O {
    int abc(String s);
}
