package com.taxcalculator;

public class Main {
    public static void main(String[] args) {
        Budget reform = new Budget(500f);
        TaxCalculator calculator = new TaxCalculator();

        System.out.println(calculator.calculate(reform, new ICMS()));
        System.out.println(calculator.calculate(reform, new ISS()));
        System.out.println(calculator.calculate(reform, new KCV()));

    }
}
