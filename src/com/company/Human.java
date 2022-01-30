package com.company;

import java.util.Date;


public class Human {
    String firstName;
    String lastNam;
    Integer age;
    Double weight;
    Animal pet;
    private Car vehicle;
    private Double salery;


    public Double getSalery() {
        System.out.print( "Daily wage rate - " + new Date() );
        System.out.println(" - value: " + this.salery + " $");
        return salery;
    }

    public void setSalery(Double salery) {
        if (salery < 0)
        {
            System.out.println("No way, I don't work for that salary");
        } else {
            this.salery = salery;
            System.out.println("New payment saved " + salery + " $");
            System.out.println("Get the addendum from Hanki");
            System.out.println("The information was passed to Mafia from US and Zus");

        }

     }

    public Car getVehicle() {
        return vehicle;
    }

    public void setVehicle(Car vehicle) {
        //this.vehicle = vehicle;
        if(this.salery > vehicle.value) {
            System.out.println("bought for gold");
            this.vehicle = vehicle;
        }else if (this.salery > vehicle.value / 12){
            System.out.println("bought with gold borrowed from the bank ");
            this.vehicle = vehicle;
        } else
            System.out.println("no gold no car, look for a better job");
    }
}


