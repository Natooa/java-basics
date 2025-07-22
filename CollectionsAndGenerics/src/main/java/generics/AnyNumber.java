package generics;

public class AnyNumber <T extends Number>{
    private T first;
    private T second;

    public AnyNumber(T first, T second){
        this.first = first;
        this.second = second;
    }

    public void print(AnyNumber<?> pt) {
        System.out.println(pt);
    }

    @Override
    public String toString() {
        return "AnyNumber{" + "first=" + first + ", second=" + second + '}';
    }
}

class Main2 {
    public static void main(String[] args) {
        AnyNumber<Integer> integerAnyNumber = new AnyNumber<>(1, 5);
        AnyNumber<Double> doubleAnyNumber = new AnyNumber<>(2.0, 3.5);

        integerAnyNumber.print(doubleAnyNumber);
    }
}
