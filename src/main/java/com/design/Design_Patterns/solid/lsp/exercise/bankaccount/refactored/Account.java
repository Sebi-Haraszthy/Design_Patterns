package com.design.Design_Patterns.solid.lsp.exercise.bankaccount.refactored;

import java.math.BigDecimal;

public abstract class Account {
    protected abstract void deposit(BigDecimal amount);
}