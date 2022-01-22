package com.umbrella.designpattern.creational.builder.mealExample;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}