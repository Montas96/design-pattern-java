package com.umbrella.designpattern.behavioral.visitor.shoppingcarexample;

public interface ShoppingCartVisitor {

    double visit(Product product);

    double visit(Pack pack);

}
