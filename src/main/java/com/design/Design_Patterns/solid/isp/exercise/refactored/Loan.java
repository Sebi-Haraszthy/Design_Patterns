package com.design.Design_Patterns.solid.isp.exercise.refactored;

public interface Loan extends Payment {
    void initiateLoanSettlement();

    void initiateRepayment();
}