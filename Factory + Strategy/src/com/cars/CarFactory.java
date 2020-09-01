package com.cars;

public class CarFactory {
    public Car generateCar(Car type){
        return type.makeCars();
    }
}
