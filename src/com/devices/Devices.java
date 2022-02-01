package com.devices;

public abstract class Devices {
    String producer;
    String model;
    Integer yearOfProduction;

 /*   public Devices(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
*/

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
