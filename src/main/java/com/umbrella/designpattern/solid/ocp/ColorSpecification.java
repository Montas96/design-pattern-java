package com.umbrella.designpattern.solid.ocp;

public class ColorSpecification implements Specification<Product>{

    private final Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }


    @Override
    public boolean isSatisfied(Product item) {
        return item.getColor().equals(color);
    }
}
