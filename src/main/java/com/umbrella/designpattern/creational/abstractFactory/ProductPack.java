package com.umbrella.designpattern.creational.abstractFactory;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ProductPack extends AbstractPack{

    private Instant createdDate;

    private int stock;

    List<Product> products = new ArrayList<>();

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductPack{" +
                "createdDate=" + createdDate +
                ", stock=" + stock +
                ", products=" + products +
                "} " + super.toString();
    }
}
