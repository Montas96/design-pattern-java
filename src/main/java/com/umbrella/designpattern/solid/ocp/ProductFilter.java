package com.umbrella.designpattern.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    Stream<Product> filterByColor(List<Product> products, Color color){
        return  products.stream().filter(product -> product.getColor().equals(color));
    }
    Stream<Product> filterBySize(List<Product> products, Size size){
        return  products.stream().filter(product -> product.getSize().equals(size));
    }
    Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size){
        return  products.stream().filter(product -> product.getColor().equals(color) && product.getSize().equals(size));
    }
}
