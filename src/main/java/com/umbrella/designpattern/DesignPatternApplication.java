package com.umbrella.designpattern;

import com.umbrella.designpattern.creational.factory.AbstractProduct;
import com.umbrella.designpattern.creational.factory.AbstractProductFactory;
import com.umbrella.designpattern.creational.factory.ProductFactory;
import com.umbrella.designpattern.creational.factory.ServiceFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
    }
}
