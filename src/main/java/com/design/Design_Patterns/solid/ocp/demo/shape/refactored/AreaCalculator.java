package com.design.Design_Patterns.solid.ocp.demo.shape.refactored;

import java.util.List;

public class AreaCalculator {
    public void calculateArea(List<Shape> shapes) {
        double area = 0;

        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        System.out.println("Total area = " + area);
    }
}