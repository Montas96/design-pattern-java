package com.umbrella.designpattern.creational.abstractFactory;

import java.time.Instant;

public class ServiceFactoryImp implements IAbstractServiceFactory{

    @Override
    public Service getService() {
        Service service = new Service();
        service.setStartDate(Instant.now());
        service.setDurationInDay(30);
        service.setId("SERVICE");
        service.setName("Service 1");
        return service;
    }
}
