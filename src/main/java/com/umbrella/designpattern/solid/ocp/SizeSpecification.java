package com.umbrella.designpattern.solid.ocp;

public class SizeSpecification implements  Specification<Product> {

    private final Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize().equals(size);
    }
}
