package com.stationerybuilder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Buy buy = new BuyBuilder()
                .setBuy(1)
                .setClient(1, "Carlos", "99999999")
                .setSeller(1, "João")
                .setProduct("2B pencil", 2, (float)1.50)
                .setProduct("Eraser", 3, (float)0.50)
                .builder();

        buy.show();
    }
}
