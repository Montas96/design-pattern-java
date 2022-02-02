package com.umbrella.designpattern.structural.decorator.encodingExample;

public interface DataSource {
    void writeData(String data);

    String readData();

}
