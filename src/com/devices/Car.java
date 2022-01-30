package com.devices;

public class Car extends Devices {

  //      final String model;
  //  final String producer;
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

    public  boolean equals (Car car){
        if (this == car){
            return true;
        } else if (this.model.equals(car.model)
                && this.producer.equals(car.producer)
                && this.value.equals(car.value)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", millage=" + millage +
                ", age=" + age +
                ", value=" + value +
                ", manualGar=" + manualGar +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("I turn on the key");
    }
}
