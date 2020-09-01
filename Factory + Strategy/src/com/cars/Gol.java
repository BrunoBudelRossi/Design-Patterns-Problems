package com.cars;

public class Gol implements Car{
    private String model;

    public String getModel() {
        return model;
    }

    @Override
    public Car makeCars() {
        Gol gol = new Gol();
        gol.model = "Gol";
        return gol;
    }
}
