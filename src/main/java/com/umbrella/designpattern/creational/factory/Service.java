package com.umbrella.designpattern.creational.factory;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.Instant;

@Document("products")
public class Service extends AbstractProduct implements Serializable {

    private Instant startDate;

    private Instant endDate;

    public Instant getStartDate() {
        return startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Service{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                "} " + super.toString();
    }
}
