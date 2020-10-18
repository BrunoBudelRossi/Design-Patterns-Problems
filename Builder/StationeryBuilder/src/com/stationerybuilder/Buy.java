package com.stationerybuilder;
import java.util.List;

public class Buy {
    private int id;
    private List<Product> products;
    private Client client;
    private Seller seller;

    public float totalAmountPayable(){
        float amount = 0f;
        for(Product product : products){
            amount += product.getValue() * product.getAmount();
        }
        return amount;
    }

    public int totalProducts(){
        int amountProducts = 0;
        for(Product product : products){
            amountProducts += product.getAmount();
        }
        return amountProducts;
    }

    public void show(){
        System.out.println("Número do pedido " + this.getId() + ", do cliente " + this.getClient().getName() + ", do vendedor "
                + this.getSeller().getName() + ", com " + this.totalProducts() + " produtos " + "e com o valor total de "
                + this.totalAmountPayable());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
