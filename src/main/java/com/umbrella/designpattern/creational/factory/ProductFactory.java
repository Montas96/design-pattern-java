package com.umbrella.designpattern.creational.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import java.util.List;

public class ProductFactory extends AbstractProductFactory{



    @Override
    protected Product createProduit() {

        Product product = new Product();
        product.setName("PRODUCT-1");
        product.setPrice(12.5);
        return product;
    }

}
