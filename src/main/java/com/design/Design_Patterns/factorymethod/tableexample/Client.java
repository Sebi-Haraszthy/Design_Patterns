package com.design.Design_Patterns.factorymethod.tableexample;

public class Client {
    public static void main(String[] args) {
        TableFactory tableFactory = new TableFactory();
        Table table = tableFactory.createTable("kitchen");

        System.out.println(table instanceof BedroomTable);
    }
}