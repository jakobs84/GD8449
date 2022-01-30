package com.company;

public class Car {

    final String model;
    final String producer;
    String color;
    Double millage;
    Integer age;
    Double value;
    Boolean manualGar;

    public Car(String producer, String model, Double value) {
        this.producer = producer;
        this.model = model;
        this.millage = 0.0;
        this.value = value;
    }

}
