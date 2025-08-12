package org;

public class Test2 {
    static void def(I i) {
//        System.out.println(i.abc());
        System.out.println(i.abc("Hello", 18));
    }

    public static void main(String[] args) {
//        def(() -> {return 18;});
//        def(() -> 18);

        def((String s, int a) -> "Hello" + 19);
        def((s, a) -> "hello" + 20);
    }
}

interface I {
//    int abc();
    String abc(String s, int a);
}
