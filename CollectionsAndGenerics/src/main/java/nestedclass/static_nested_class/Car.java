package nestedclass.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);

            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }
}

class Test{
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);
        System.out.println(e.toString());

        Car car = new Car("red", 2, e);
        System.out.println(car.toString());
    }
}

class Z extends Car.Engine{
    Z( ) {
        super(200);
    }
}

