package nestedclass.anonymous_class;

public class AnonymousClass {
    private int x = 5;
    public static void main(String[] args) {
        Math m  = new Math() {
            int c = 10;

            void abc() {}

            @Override
            public int doOperation(int a, int b) {
                AnonymousClass ac = new AnonymousClass();
                return a + b + ac.x;
            }
        };

        Math m2  = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        System.out.println(m.doOperation(5, 3));
        System.out.println(m2.doOperation(5, 3));

    }
}

class Math{
    int doOperation(int a, int b) {
        return a / b;
    }
}

//interface Math{
//    int doOperation(int a, int b);
//}
