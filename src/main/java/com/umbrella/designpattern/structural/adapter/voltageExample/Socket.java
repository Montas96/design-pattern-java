package com.umbrella.designpattern.structural.adapter.voltageExample;

public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
