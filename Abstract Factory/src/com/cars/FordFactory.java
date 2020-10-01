package com.cars;

public class FordFactory implements CarFactory{
    @Override
    public LuxuryCar makeLuxuryCar() {
        return new Mustang();
    }

    @Override
    public PopularCar makePopularCar() {
        return new Ka();
    }
}
