package com.tvprototype;

public class TvSamsung1 extends SamsungPrototype{
    protected TvSamsung1 (TvSamsung1 tv) {
        this.screen = "LED 43 Full HD";
        this.saleValue = tv.getSaleValue();
    }


    public TvSamsung1() {

    }


    public String TvInfo() {

        System.out.println("A TvSamsung1 POSSUI TELA " + this.screen + " e custa " + getSaleValue());
        return null;
    }


    public SamsungPrototype clone() {

        return new TvSamsung1 (this);
    }
}
