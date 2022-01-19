package com.umbrella.designpattern.creational.abstractFactory;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory implements IAbstractFactory {

    @Override
    public AbstractProduct getProduct() {
        Product product = new ProductFactoryImp().getProduct();
        return product;
    }

    @Override
    public AbstractProduct getService() {
        Service service = new ServiceFactoryImp().getService();
        return service;
    }

    @Override
    public AbstractPack getProductPack() {
        ProductPack productPack = new ProductPackFactoryImp().getProductPack();
        return productPack;
    }

    @Override
    public AbstractPack getServicePack() {
        ServicePack servicePack = new ServicePackFactoryImp().getServicePack();
        return servicePack;
    }

    @Override
    public List getAllProducts() {
        List products = new ArrayList<>();
        products.add(getProduct());
        products.add(getService());
        return products;
    }

    @Override
    public List getAllPacks() {
        List products = new ArrayList<>();
        products.add(getProductPack());
        products.add(getServicePack());
        return products;
    }

    @Override
    public List getAll(String type) {
        List products = new ArrayList<>();
        switch (type) {
            case "PRODUCTS" : {
                products.add(getProduct());
                products.add(getProductPack());
                break;
            }
            case "SERVICE" : {
                products.add(getService());
                products.add(getServicePack());
                break;
            }
            default: throw new RuntimeException("Type not defined");
        }
        return products;
    }
}
