package com.cars;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car ka = carFactory.generateCar(new Ka());
        System.out.println(ka.getModel() + " foi criado");

        Car up = carFactory.generateCar(new Up());
        System.out.println(up.getModel() + " foi criado");

        Car gol = carFactory.generateCar(new Gol());
        System.out.println(gol.getModel() + " foi criado");
    }
}
