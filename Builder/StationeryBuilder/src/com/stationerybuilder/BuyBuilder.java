package com.stationerybuilder;

import java.util.ArrayList;

public class BuyBuilder {
    private Buy instance;

    public BuyBuilder() {
        this.instance = new Buy();
    }

    public BuyBuilder setBuy(int buyNumber){
        instance.setId(buyNumber);
        return this;
    }

    public BuyBuilder setClient(int id, String name, String phone){
        Client client = new Client();
        client.setId(id);
        client.setName(name);
        client.setPhone(phone);

        instance.setClient(client);

        return this;
    }

    public BuyBuilder setSeller(int id, String name){
        Seller seller = new Seller();
        seller.setId(id);
        seller.setName(name);

        instance.setSeller(seller);

        return this;
    }

    public BuyBuilder setProduct(String name, int amount, float value){
        Product product = new Product();
        product.setName(name);
        product.setAmount(amount);
        product.setValue(value);

        if(instance.getProducts() == null){
            instance.setProducts(new ArrayList<>());
        }
        instance.getProducts().add(product);

        return this;
    }

    public Buy builder(){
        return instance;
    }



}
