package com.umbrella.designpattern.creational.abstractFactory;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProduct {

    @Id
    private String id;

    private String name;

    private String description;

    private String imageURL;

    private List<String> categories = new ArrayList<>();

    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AbstractProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", categories=" + categories +
                ", price=" + price +
                '}';
    }
}
