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
        System.out.println("I turn on the key");
    }

    @Override
    public void sell(Human buyer, Human saller, Double price) {
        if (buyer.casch < price)
        {
            System.out.println("Sory kupujący ma za mało kasy na kupno ");
        } else if (saller.hasCar()== null) {
            System.out.println("Sory sprzedającty nie ma samochodu ");
        } else {
            saller.casch +=price;
            buyer.casch -=price;
            saller.car = null;
            buyer.car = this;
            System.out.println("Gratulacje kupił pan cegłe");
        }
    }

    abstract public void Refuel();
}
