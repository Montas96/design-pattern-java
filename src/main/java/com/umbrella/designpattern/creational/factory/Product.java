package com.umbrella.designpattern.creational.factory;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("products")
public class Product extends AbstractProduct implements Serializable {

    @Override
    public String toString() {
        return "Product{} " + super.toString();
    }
}
