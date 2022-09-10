package com.umbrella.designpattern.solid.ocp;

import java.util.List;

public class OCP {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        /** This exemple break the  Open Close Principle
         * because each time we need a new filter we have to change or add new method in Product Filter Class
         * **/
        List<Product> products = List.of(apple,tree, house);
        ProductFilter productFilter = new ProductFilter();
        productFilter.filterByColor(products, Color.GREEN).forEach(product -> System.out.println(product.getName() + " is a Green"));
        productFilter.filterBySize(products, Size.SMALL).forEach(product -> System.out.println(product.getName() + " is a Small"));
        productFilter.filterByColorAndSize(products, Color.BLUE, Size.LARGE).forEach(product -> System.out.println(product.getName() + " is a Blue and large"));

        /**
         * In Order to make it better we create Specification <T>  interface for filter Criteria.
         * With boolean isSatisfied method
         * Using Generic render our program more generic and reusable for many kind of items
         * We create then ColorSpecification and SizeSpecification class that implement filter logic
         * Next we create new Filter interface (Generic )
         * **/
        System.out.println();
        System.out.println();
        OCPFilter filter = new OCPFilter();
        filter.filter(products, new ColorSpecification(Color.GREEN)).forEach(product -> System.out.println(product.getName() + " is Green"));
        filter.filter(products, new SizeSpecification(Size.SMALL)).forEach(product -> System.out.println(product.getName() + " is small"));
        filter.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE)
        )).forEach(product -> System.out.println(product.getName() + " is a Blue and large"));

    }
}
