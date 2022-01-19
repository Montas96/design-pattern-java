package com.umbrella.designpattern.creational.abstractFactory;

import java.time.Instant;

public class Product extends AbstractProduct {

    private Instant createdDate;

    private boolean online;

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    @Override
    public String toString() {
        return "Product{" +
                "createdDate=" + createdDate +
                ", online=" + online +
                "} " + super.toString();
    }
}
