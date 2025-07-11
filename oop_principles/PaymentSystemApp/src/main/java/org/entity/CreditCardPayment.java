package org.entity;

import org.utils.Payment;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void pay(double amount) {

        if(amount > balance || amount < 0) {
            throw new IllegalArgumentException("You cant take more money then in your balance");
        }
        balance -= amount;
    }
}
