package com.taxcalculator;

public class KCV implements Tax {
    @Override
    public float calculate(Budget budget) {
        return (float) (budget.getValue() * 0.2);
    }
}
