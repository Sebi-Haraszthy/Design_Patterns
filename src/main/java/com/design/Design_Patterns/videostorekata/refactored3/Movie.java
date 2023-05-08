package com.design.Design_Patterns.videostorekata.refactored3;

public abstract class Movie {
    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getPrice(int daysRented);

    public abstract int getFrequentRenterPoints(int daysRented);
}