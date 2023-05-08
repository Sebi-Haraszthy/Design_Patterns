package com.design.Design_Patterns.solid.isp.exercise.refactored;

import java.util.ArrayList;
import java.util.List;

public class LoanPayment implements Loan {
    @Override
    public Object status() {
        return new Object();
    }

    @Override
    public List<Object> getPayments() {
        return new ArrayList<>();
    }

    @Override
    public void initiateLoanSettlement() {
    }

    @Override
    public void initiateRepayment() {
    }
}