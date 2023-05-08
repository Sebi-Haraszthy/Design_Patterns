package com.design.Design_Patterns.solid.dip.exercise.wallet.refactored;

public class DebitCard implements Card {
    public void doTransaction(int amount) {
        System.out.println("TX done with DebitCard.");
    }
}