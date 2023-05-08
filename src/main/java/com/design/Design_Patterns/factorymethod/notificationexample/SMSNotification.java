package com.design.Design_Patterns.factorymethod.notificationexample;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS notification...");
    }
}