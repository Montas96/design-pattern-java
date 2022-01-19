package com.umbrella.designpattern.creational.abstractFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/abstract-factory")
public class ClientResource {

    IAbstractFactory factory = new ProductFactory();

    @GetMapping("/products")
    public List getProducts() {
        return factory.getAllProducts();
    }

    @GetMapping("/packs")
    public List getPacks() {
        return factory.getAllPacks();
    }
}
