package com.umbrella.designpattern.creational.factory;

import java.util.List;

public abstract class AbstractProductFactory {


    protected abstract AbstractProduct createProduit();

    public AbstractProduct getProduct(){
        return createProduit();
    }

}
