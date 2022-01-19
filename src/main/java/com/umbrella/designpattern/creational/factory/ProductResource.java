package com.umbrella.designpattern.creational.factory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class ProductResource {

    @GetMapping("product")
    public AbstractProduct getProduct() {
        AbstractProductFactory produitFactory1 = new ProductFactory();
        AbstractProductFactory produitFactory2 = new ServiceFactory();
        AbstractProduct products = null;
        System.out.println("Utilisation de la premiere fabrique");
        products = produitFactory1.getProduct();
        System.out.println(products.toString());
        System.out.println("Utilisation de la seconde fabrique");
        products = produitFactory2.getProduct();
        System.out.println(products.toString());
        return products;
    }
}
