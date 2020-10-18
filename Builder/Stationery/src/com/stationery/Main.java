package com.stationery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setId(1);
        client.setName("Carlos");
        client.setPhone("99999999");

        Seller seller = new Seller();
        seller.setId(1);
        seller.setName("João");

        Product pencil = new Product();
        pencil.setName("2B Pencil");
        pencil.setAmount(1);
        pencil.setValue((float) 2.50);

        Product eraser = new Product();
        eraser.setName("Eraser");
        eraser.setAmount(2);
        eraser.setValue((float) 1.25);

        Buy buy = new Buy();
        buy.setId(1);
        buy.setClient(client);
        buy.setSeller(seller);
        buy.setProducts(new ArrayList<>());
        buy.getProducts().add(pencil);
        buy.getProducts().add(eraser);

        buy.show();
    }
}
