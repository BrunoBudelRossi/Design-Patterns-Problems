package com.taxcalculator;

public class TaxCalculator {
    public float calculate(Budget budget, Tax tax){
        return tax.calculate(budget);
    }
}
