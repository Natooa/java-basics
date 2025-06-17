package myapp;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator("Nurdiyar");

        myCalculator.calculate(10, 10);
        myCalculator.calculate(10.0, 10.0);
        myCalculator.calculate(10, 10, 15);

        myCalculator.printInfo();
    }
}
