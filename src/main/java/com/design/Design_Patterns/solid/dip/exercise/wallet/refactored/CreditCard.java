package com.design.Design_Patterns.solid.dip.exercise.wallet.refactored;

public class CreditCard implements Card {
    public void doTransaction(int amount) {
        System.out.println("TX done with CreditCard.");
    }
}