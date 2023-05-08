package com.design.Design_Patterns.solid.isp.exercise.refactored;

import java.util.List;

public interface Payment {
    Object status();

    List<Object> getPayments();
}