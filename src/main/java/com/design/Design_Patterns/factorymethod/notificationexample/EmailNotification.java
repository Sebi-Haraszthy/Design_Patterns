package com.design.Design_Patterns.factorymethod.notificationexample;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending email notification...");
    }
}