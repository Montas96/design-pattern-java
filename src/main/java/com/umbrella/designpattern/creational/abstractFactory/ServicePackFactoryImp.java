package com.umbrella.designpattern.creational.abstractFactory;

public class ServicePackFactoryImp implements IAbstractServicePackFactory{

    @Override
    public ServicePack getServicePack() {
        ServicePack servicePack = new ServicePack();
        servicePack.setId("PACK-SERVICE");
        servicePack.setName("Service pack");
        servicePack.setPrice(40.5);
        servicePack.getServices().add((Service) new ProductFactory().getProduct());
        return servicePack;
    }
}
