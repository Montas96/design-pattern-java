package com.umbrella.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class DemoVisitor {

    public static void main(String[] args) {
        Product product = new Product();
        product.setId("1");
        product.setCode("1");
        product.setName("Product 1");
        product.setUnitPrice(100);

        Product product2 = new Product();
        product2.setId("2");
        product2.setCode("2");
        product2.setName("Product 2");
        product2.setUnitPrice(200);

        Product product3 = new Product();
        product3.setId("3");
        product3.setCode("3");
        product3.setName("Product 3");
        product3.setUnitPrice(50);

        List<Product> products = new ArrayList<>();
        products.add(product2);
        products.add(product3);
        Pack pack = new Pack();
        pack.setId("Pack");
        pack.setName("Pack");
        pack.setCode("Pack");
        pack.setProducts(products);
        pack.setDiscount(25);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product);
        cart.addProduct(pack);
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        double totalPrice = cart.calculatePrice(visitor);
        System.out.println("Total Price: $" + totalPrice);

    }
}
