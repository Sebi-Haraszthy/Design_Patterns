package com.design.Design_Patterns.observer.smarthome;

public interface Observable {
    void registerObserver(Observer observer);

    void notifyObservers();
}