package com.umbrella.designpattern.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

public class OCPFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specification) {
        return items.stream().filter(item -> specification.isSatisfied(item));
    }
}
