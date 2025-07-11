package org.utils;

import org.contracts.Payable;

public abstract class Payment implements Payable {
    protected double balance;
    protected String name;

    public Payment(String name, double balance) {
        if(balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Balance: " + balance;
    }

    public abstract void pay(double amount);
}
