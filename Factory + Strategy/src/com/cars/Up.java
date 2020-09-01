package com.cars;

public class Up implements Car{
    private String model;

    public String getModel() {
        return model;
    }

    @Override
    public Car makeCars() {
        Up up = new Up();
        up.model = "Up";
        return up;
    }
}
