package com.umbrella.designpattern.creational.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

public class ServiceFactory extends AbstractProductFactory {


    @Override
    protected Service createProduit() {

        Service service = new Service();
        service.setName("SERVICE");
        service.setStartDate(Instant.now());
        return service;
    }

}
