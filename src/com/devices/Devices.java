package com.devices;

public abstract class Devices {
    String producer;
    String model;
    Integer yearOfProduction;

public abstract void turnOn();

    @Override
    public String toString() {
        return "Devices{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
