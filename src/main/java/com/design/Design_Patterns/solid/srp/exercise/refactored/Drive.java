package com.design.Design_Patterns.solid.srp.exercise.refactored;

public class Drive {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();
        CarService carService = new CarService(carRepository);
        CarController carController = new CarController(carService);

        System.out.println(carController.getMostExpensiveCar());
        System.out.println(carController.getCarsNames());
    }
}