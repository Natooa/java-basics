package calculator;

import java.util.Scanner;

public class CalculatorApp {
    //Scanner for input symbols
    private static final Scanner scanner = new Scanner(System.in);



    //getInt operation method
    private static int getInt(){
        System.out.print("Please enter a number: ");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Please enter an integer");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    //getOperation method
    private static char getOperation(){
        System.out.print("Please enter a operation (+, -, *, /): ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }else {
            System.out.println("Please enter an operation");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    //primary method for calculator
    private static int calc(int a, int b, char operation){
        int result;
        switch (operation){
            case '+' -> {
                result = a + b;
            }
            case '-' -> {
                result = a - b;
            }
            case '*' -> {
                result = a * b;
            }
            case  '/' -> {
                if(b == 0) {
                    System.out.println("Cannot divide by zero");
                    b = getInt();
                }
                result = a / b;
            }
            default -> {
                System.out.println("invalid operation");
                result = calc(a, b, operation);
            }
        }
        return result;
    }

    public static void start() {
        System.out.println("Welcome to the main program");
        while(true){
            System.out.println("1. Continue work app \n2. Exit");
            if(scanner.hasNextInt()) {
                switch (scanner.nextInt()) {
                    case 1 -> {
                        int num1 = getInt();
                        int num2 = getInt();
                        char oper = getOperation();
                        int result = calc(num1, num2, oper);
                        System.out.println("Your result is: " + result);
                    }
                    case 2 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> {
                        System.out.println("invalid operation");
                    }
                }
            } else {
                System.out.println("Invalid input");
                scanner.next();
            }
        }
    }
}
