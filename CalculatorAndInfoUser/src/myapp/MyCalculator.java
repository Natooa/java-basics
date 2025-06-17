package myapp;

public class MyCalculator {
    private static int count_operation = 0;
    private final String author = "Nurdiyar";

    private String owner;

    public MyCalculator(String owner) {
        this.owner = owner;
    }

    public int calculate(int a, int b) {
        int result = a + b;
        System.out.println("[int + int] " + a + " + " + b + " = " + result);
        System.out.println("------------------------------------------------");
        count_operation++;
        return result;
    }

    public double calculate(double a, double b) {
        double result = a * b;
        System.out.println("[double * double] " + a + " * " + b + " = " + result);
        System.out.println("------------------------------------------------");
        count_operation++;
        return result;
    }

    public int calculate(int a, int b, int c) {
        int result = (a + b + c) / 3;
        System.out.println("[(int + int + int) / 3] (" + a + " + " + b + " + " + c + ") / 3" + " = " + result);
        System.out.println("------------------------------------------------");
        count_operation++;
        return result;
    }

    public void printInfo() {
        System.out.println("Calc created by + " + author);
        System.out.println("Calc owner + " + this.owner);
        System.out.println("Calc count operation = " + count_operation);
    }
}
