package com.tvprototype;

public class TvPhillips2 extends PhillipsPrototype{
        protected TvPhillips2 (TvPhillips2 tv) {
            this.screen = "LED 55 4K Ultra HD AMBILIGHT";
            this.saleValue = tv.getSaleValue();
        }

        public TvPhillips2() {

        }

        public String TvInfo() {
            System.out.println("A TV Phillips TV55PUG6794 POSSUI TELA " + this.screen + " e custa " + getSaleValue());
            return null;
        }


        public PhillipsPrototype clone() {

            return new TvPhillips2 (this);
        }
}
