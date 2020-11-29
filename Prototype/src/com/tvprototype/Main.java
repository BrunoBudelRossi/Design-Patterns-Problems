package com.tvprototype;

public class Main {

    public static void main(String[] args) {
        TvSamsung1 TvSamsung1prototype = new TvSamsung1();
        SamsungPrototype newTSamsung1prototype =  TvSamsung1prototype.clone();
        newTSamsung1prototype.setSaleValue(1890);
        newTSamsung1prototype.TvInfo();

        TvSamsung2 TvSamsung2prototype = new TvSamsung2();
        SamsungPrototype newTvSamsung2 =  TvSamsung2prototype.clone();
        newTvSamsung2.setSaleValue(2099);
        newTvSamsung2.TvInfo();

        TvPhillips1 TvPhillips1prototype = new TvPhillips1();
        PhillipsPrototype TvPhillips1nova =  TvPhillips1prototype.clone();
        TvPhillips1nova.setSaleValue(3199);
        TvPhillips1nova.TvInfo();

        TvPhillips2 TvPhillips2prototype = new TvPhillips2();
        PhillipsPrototype newTvPhillips2 =  TvPhillips2prototype.clone();
        newTvPhillips2.setSaleValue(3199);
        newTvPhillips2.TvInfo();
    }
}
