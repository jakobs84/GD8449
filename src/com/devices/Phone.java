package com.devices;

public class Phone extends Devices {
/*
    String producer;
    String model;
    Integer yearOfProduction;
 */

    public Phone(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }


    @Override
    public void turnOn() {
        System.out.println("Push button!!");
    }


}
