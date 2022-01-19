package com.umbrella.designpattern.creational.abstractFactory;

import java.util.List;

public interface IAbstractFactory {

    AbstractProduct getProduct();
    AbstractProduct getService();

    AbstractPack getProductPack();
    AbstractPack getServicePack();

    List getAllProducts();

    List  getAllPacks();

    List getAll(String type);
}
