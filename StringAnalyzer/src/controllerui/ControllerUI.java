package controllerui;

import java.util.Scanner;

import stringanalyzer.StringAnalyzer;
import stringanalyzer.StringAnalyzerImpl;

public class ControllerUI {
    private final Scanner scanner = new Scanner(System.in);
    private final StringAnalyzer stringAnalyzer = new StringAnalyzerImpl();
    public void start() {
        System.out.println("Hello its StringAnalyzer the last three days i repeat String class and i have some relax");
        while(true) {
            System.out.println("1. How many words in your text. " +
                    "\n2. How many symbols in your text. " +
                    "\n3. How many vowels and consonants in your text. " +
                    "\n4. ParseEmail." +
                    "\n5. Exit.");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Put your text: ");
                    stringAnalyzer.calculateWords(scanner.nextLine());
                }
                case 2 -> {
                    System.out.println("Put your text: ");
                    stringAnalyzer.calculateSymbol(scanner.nextLine());
                }
                case 3 -> {
                    System.out.println("Put your text: ");
                    stringAnalyzer.calculateVowelAndConsonants(scanner.nextLine());
                }
                case 4 -> {
                    System.out.println("Put your text: ");
                    stringAnalyzer.parseEmail(scanner.nextLine());
                }
                case 5 -> {
                    System.out.println("Thank you for using our StringAnalyzer !\nBye!");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
