package com.design.Design_Patterns.observer.youtubeexample;

public interface Observable {
    void registerObserver(Observer observer);

    void notifyObservers();
}