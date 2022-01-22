package com.umbrella.designpattern.creational.builder.mealExample;

public interface Item {
    String name();

    Packing packing();

    float price();
}
