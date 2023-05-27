package com.umbrella.designpattern.behavioral.visitor;

import java.time.Instant;

public abstract class AbstractProduct {

    private String id;
    private String code;
    private Instant creationDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    abstract double accept(ShoppingCartVisitor shoppingCartVisitor);
}
