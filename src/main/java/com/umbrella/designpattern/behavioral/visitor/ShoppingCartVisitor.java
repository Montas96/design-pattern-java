package com.umbrella.designpattern.behavioral.visitor;

public interface ShoppingCartVisitor {

    double visit(Product product);

    double visit(Pack pack);

}
