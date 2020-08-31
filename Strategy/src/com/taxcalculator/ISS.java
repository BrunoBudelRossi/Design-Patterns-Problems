package com.taxcalculator;

public class ISS implements Tax{

    @Override
    public float calculate(Budget budget) {
        return (float) (budget.getValue() * 0.1);
    }
}
