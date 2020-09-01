package com.cars;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car ka = carFactory.generateCar("Ka");
        ka.makeCars();

        Car up = carFactory.generateCar("Up");
        up.makeCars();
    }
}
