package org.entity;

import org.utils.Payment;

import java.util.Scanner;

public class PayPalPayment extends Payment {
    private final Scanner scanner = new Scanner(System.in);
    private double cashback = 0;
    public PayPalPayment(String name, double balance) {
        super(name, balance);
    }

    @Override
    public String toString() {
        return super.toString() + " Cashback: " + cashback;
    }

    @Override
    public void pay(double amount) {
        if(amount > balance || amount < 0) {
            throw new IllegalArgumentException("You cant take more money then in your balance");
        }
        System.out.println("Do you want to pay with cashback?");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("yes")) {
            if(amount > cashback && cashback > 0) {
                amount = amount - cashback;
                balance = balance - amount;
                cashback = 0;
            } else if (amount > cashback && cashback <= 0) {
                balance -= amount;
                cashback += (amount / 3);
            }
        } else {
            balance -= amount;
            cashback += (amount / 3);
        }
    }
}
