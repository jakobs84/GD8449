package com.devices;

public abstract class Car extends Devices implements SaleAble {

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
        System.out.println("I'm turning the car key");
    }

    @Override
    public void sell(Human buyer, Human saller, Double price) {
        if (buyer.casch < price)
        {
            System.out.println("Sory the buyer doesn't have enough money to buy car " +saller.car.producer +" "+ saller.car.model);
        } else if (saller.hasCar()== null) {
            System.out.println("Sorry the seller doesn't have a car ");
        } else {
            saller.casch +=price;
            buyer.casch -=price;
            saller.car = null;
            buyer.car = this;
            System.out.println("Congratulations you bought a brick - " +buyer.car.producer +" "+ buyer.car.model );

        }
    }

    abstract public void Refuel();
}
