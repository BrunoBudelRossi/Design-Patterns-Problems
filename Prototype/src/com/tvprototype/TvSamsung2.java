package com.tvprototype;

public class TvSamsung2 extends SamsungPrototype {
    protected TvSamsung2 (TvSamsung2 tv) {
        this.screen = "LED 50 UHD 4K";
        this.saleValue = tv.getSaleValue();
    }

    public TvSamsung2() {

    }

    public String TvInfo() {

        System.out.println("A TV 50RU7100 POSSUI TELA " + this.screen + " e custa " + getSaleValue());
        return null;
    }

    public SamsungPrototype clone() {

        return new TvSamsung2(this);
    }

}
