package com.devices;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Devices implements SaleAble {

    String color;
    Double millage;
    Integer age;
    Double value;
    Integer yearOfProduction;
    Boolean manualGar;
    public List<Human> carOwners;

    public Car(String producer, String model, Integer yearOfProduction, Double value) {
        this.producer = producer;
        this.model = model;
        this.millage = 0.0;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
        this.carOwners = new ArrayList<Human>();
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
                ", value=" + value +
                ", yearOfProduction=" + yearOfProduction +
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
        } else if (!saller.hasCar()) {
            System.out.println("Sorry the seller doesn't have a car ");
        } else if(!this.carOwnerLast(saller)) {
            System.out.println("Sorry the seller wasn't last in car history");
        } else {
            saller.casch +=price;
            buyer.casch -=price;
            saller.removwCar(this);
            buyer.addCar(this);
            carHistory(buyer);
        }
    }


    public void carHistory(Human h){
        this.carOwners.add(h);
        System.out.println("The vehicle card has been updated .");
    }

    public int carOwnersCount(){
        return this.carOwners.size();
    }

    public boolean carOwnerWas(Human h){
        if (carOwners.contains(h))
        {
            System.out.println(h.lastNam + " " +h.firstName + " was owner a car");
            return true;
        } else {
            System.out.println(h.lastNam + " " +h.firstName + " wan't owner a car");
            return false;
        }
    }

    public boolean carOwnerLast(Human h){
        if (this.carOwners.get(this.carOwners.size() - 1 ).equals(h))
        {
        //    System.out.println("Yes");
            return true;
        } else {
        //    System.out.println("No");
            return false;
        }
    }

    public void carOwnerList(Human seller, Human buyer){
        if (!carOwnerWas(seller)){}
        else if ((this.carOwners.indexOf(buyer) -1 ) == this.carOwners.indexOf(seller)){
            System.out.println(seller.lastNam + " " +seller.firstName + " sold car to " + buyer.lastNam + " " +buyer.firstName);
        } else {
            System.out.println(seller.lastNam + " " +seller.firstName + "  didn't sold car to " + buyer.lastNam + " " +buyer.firstName);
        }
    }

    abstract public void Refuel();


}
