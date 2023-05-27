package com.umbrella.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<AbstractProduct> products = new ArrayList<>();
    private double totalPrice = 0;

    public void addProduct(AbstractProduct item) {
        products.add(item);
    }

    public void removeProduct(AbstractProduct item) {
        products.remove(item);
    }

    public double calculatePrice(ShoppingCartVisitor shoppingCartVisitor){
        for (AbstractProduct item : products) {
            totalPrice =+ item.accept(shoppingCartVisitor);
        }
        return totalPrice;
    }
}
