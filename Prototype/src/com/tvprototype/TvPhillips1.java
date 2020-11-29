package com.tvprototype;

public class TvPhillips1 extends PhillipsPrototype{
    protected TvPhillips1 (TvPhillips1 tv) {
        this.screen = "LED 70 HDR";
        this.saleValue = tv.getSaleValue();
    }

    public TvPhillips1() {

    }

    public String TvInfo() {

        System.out.println("A TV Phillips TV70PUG677478 POSSUI TELA " + this.screen + " e custa " + getSaleValue());
        return null;
    }

    public PhillipsPrototype clone() {

        return new TvPhillips1(this);
    }
}
