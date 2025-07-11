package org;

import org.contracts.Payable;
import org.entity.CreditCardPayment;
import org.entity.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment("Nurdiyar", 1000);
        PayPalPayment paypalPayment = new PayPalPayment("Zhasmin", 1000);

        System.out.println(creditCardPayment.toString());
        System.out.println(paypalPayment.toString());

        creditCardPayment.pay(500);
        paypalPayment.pay(500);

        System.out.println(creditCardPayment.toString());
        System.out.println(paypalPayment.toString());

        creditCardPayment.pay(200);
        paypalPayment.pay(200);

        System.out.println(creditCardPayment.toString());
        System.out.println(paypalPayment.toString());
    }
}
