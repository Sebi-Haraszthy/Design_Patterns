package com.design.Design_Patterns.videostorekata.refactored2;

public class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getPrice() {
        double thisAmount = 0;

        switch (movie.getPriceCode()) {
            case Movie.REGULAR -> {
                thisAmount += 2;

                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 1.5;
            }
            case Movie.NEW_RELEASE -> thisAmount += daysRented * 3;
            case Movie.CHILDREN -> {
                thisAmount += 1.5;

                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5;
            }
        }

        return thisAmount;
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 1;

        if (isNewRelease() && daysRented > 1) {
            frequentRenterPoints++;
        }

        return frequentRenterPoints;
    }

    private boolean isNewRelease() {
        return movie.getPriceCode() == Movie.NEW_RELEASE;
    }
}