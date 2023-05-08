package com.design.Design_Patterns.solid.dip.exercise.wallet.refactored;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        DebitCard debitCard = new DebitCard();
        Wallet wallet = new Wallet(debitCard);
        Wallet wallet1 = new Wallet(creditCard);
        wallet.doPayment("order 1", 5000);
        wallet1.doPayment("order 2", 4000);
    }
}