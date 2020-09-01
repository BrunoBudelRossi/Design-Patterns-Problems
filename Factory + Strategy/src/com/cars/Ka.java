package com.cars;

public class Ka implements Car{
    private String model;

    public String getModel() {
        return model;
    }

    @Override
    public Car makeCars() {
        Ka ka = new Ka();
        ka.model = "Ka";
        return ka;
    }
}
