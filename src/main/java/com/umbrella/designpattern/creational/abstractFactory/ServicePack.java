package com.umbrella.designpattern.creational.abstractFactory;

import java.util.ArrayList;
import java.util.List;

public class ServicePack extends AbstractPack{

    private List<Service> services = new ArrayList<>();

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "ServicePack{" +
                "services=" + services +
                "} " + super.toString();
    }
}
