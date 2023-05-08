package com.design.Design_Patterns.factorymethod.tableexample;

public class Table {
    private final String name;

    Table(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}