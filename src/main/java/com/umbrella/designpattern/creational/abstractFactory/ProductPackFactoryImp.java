package com.umbrella.designpattern.creational.abstractFactory;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ProductPackFactoryImp implements IAbstractProductPackFactory{

    @Override
    public ProductPack getProductPack() {
        ProductPack productPack = new ProductPack();
        productPack.setStock(5);
        productPack.setCreatedDate(Instant.now());

        List<Product> products = new ArrayList<>();
        Product product = new Product();
        product.setCreatedDate(Instant.now());
        product.setOnline(true);
        product.setId("PRODUCT");
        product.setName("Product 1");
        products.add(product);
        productPack.setProducts(products);
        return productPack;
    }
}
