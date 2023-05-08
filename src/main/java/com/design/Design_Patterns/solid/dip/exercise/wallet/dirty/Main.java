package com.design.Design_Patterns.solid.dip.exercise.wallet.dirty;

public class Main {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        Wallet wallet = new Wallet(debitCard);
        wallet.doPayment("order 1", 5000);
    }
}