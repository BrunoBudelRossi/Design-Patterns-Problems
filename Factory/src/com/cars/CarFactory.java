package com.cars;

public class CarFactory {
    public Car generateCar(String type){
        if(type.length() < 1 || type == null){
            return null;
        }
        if(type == "Up")
            return new Up();
        else if(type == "Gol")
            return new Gol();
        else if(type == "Ka"){
            return new Ka();
        }

        return null;
    }
}
