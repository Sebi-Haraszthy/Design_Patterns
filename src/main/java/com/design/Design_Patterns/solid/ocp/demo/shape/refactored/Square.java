package com.design.Design_Patterns.solid.ocp.demo.shape.refactored;

public class Square extends Shape {
    private final double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return getLength() * getLength();
    }
}