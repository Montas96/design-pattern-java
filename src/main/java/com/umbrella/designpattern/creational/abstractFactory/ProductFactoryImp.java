package com.umbrella.designpattern.creational.abstractFactory;

import java.time.Instant;

public class ProductFactoryImp implements IAbstractProductFactory{

    @Override
    public Product getProduct() {
        Product product = new Product();
        product.setCreatedDate(Instant.now());
        product.setOnline(true);
        product.setId("PRODUCT");
        product.setName("Product 1");
        return product;
    }
}
