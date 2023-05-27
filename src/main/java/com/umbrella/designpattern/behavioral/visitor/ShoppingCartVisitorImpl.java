package com.umbrella.designpattern.behavioral.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public double visit(Product product) {
        System.out.println("This is product visit method");
        return product.getUnitPrice();
    }

    @Override
    public double visit(Pack pack) {
        System.out.println("This is pack visit method");
        for (Product product : pack.getProducts()) {
            pack.setTotalPrice(pack.getTotalPrice() + product.getUnitPrice());
        }
        return pack.getTotalPrice() - pack.getDiscount();
    }
}
