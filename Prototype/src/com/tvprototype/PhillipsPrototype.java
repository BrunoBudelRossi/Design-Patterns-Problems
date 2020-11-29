package com.tvprototype;

public abstract class PhillipsPrototype {
    protected double saleValue;
    protected String screen;

    public double getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(double saleValue) {
        this.saleValue = saleValue;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public abstract String TvInfo();

    public abstract PhillipsPrototype clone();
}
