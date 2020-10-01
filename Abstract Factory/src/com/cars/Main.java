package com.cars;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new FordFactory();

        LuxuryCar luxury = factory.makeLuxuryCar();
        PopularCar popular = factory.makePopularCar();

        luxury.showInfo();
        popular.showInfo();
    }
}