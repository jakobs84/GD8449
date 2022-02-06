package com.devices;

import creatures.Animal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;


public class Human implements SaleAble{
    private static final int DEFAULT_GARAGE_SIZE = 4;
    public Car car;
    Phone phone;
    String firstName;
    String lastNam;
    Integer age;
    Double weight;
    Animal pet;
    private Car[] garage;
    private Double salery;
    public Double casch;

    public Human(){
        this.salery = 0.0;
        this.casch = 0.0;
        this.garage =new Car[DEFAULT_GARAGE_SIZE];
    }


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

    public Car getVehicle(Integer parkingLotNumber) {
        return this.garage[parkingLotNumber];
    }

    public void setVehicle(Car vehicle, Human carOwners) {
        //this.vehicle = vehicle;
        Integer parkingLotNumber = carInGarageNumber();
        if(this.salery > vehicle.value) {
            System.out.println("Bought for gold- " + vehicle.model + " " + vehicle.producer + " "+ vehicle.yearOfProduction);
            this.garage[parkingLotNumber] = vehicle;
            vehicle.carHistory(carOwners);
        }else if (this.salery > vehicle.value / 12){
            System.out.println("Bought with gold borrowed from the bank - " + vehicle.model + " " + vehicle.producer + " "+ vehicle.yearOfProduction);
            this.garage[parkingLotNumber] = vehicle;
            vehicle.carHistory(carOwners);
        } else
            System.out.println("no gold no car, look for a better job");
    }

    @Override
    public String toString() {
        return "Human{" +
                "car=" + car +
                ", phone=" + phone +
                ", firstName='" + firstName + '\'' +
                ", lastNam='" + lastNam + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", pet=" + pet +
                ", garage=" + Arrays.toString(garage) +
                ", salery=" + salery +
                ", casch=" + casch +
                '}';
    }


    public boolean hasCar() {
        for(int i = 0; i< this.garage.length; i++){
            if(this.garage[i] != null){
                return true;
            }
        }
        return false;
    }


    @Override
    public void sell(Human buyer, Human saller, Double price) {
        System.out.println("This is not the Middle Ages human trafficking is prohibited");
    }

    public void removwCar(Car car){
        for (int i = 0; i < this.garage.length; i++) {
            if (Objects.equals(this.garage[i], car)) {
                this.garage[i] = null;
                i = this.garage.length;
                System.out.println("Sell " + car.model + " " + car.producer + " " +car.yearOfProduction);
            } else {
                if (i == this.garage.length - 1) {
                    System.out.println("Car missing " + car.model + " " + car.producer + " " +car.yearOfProduction);
                }
            }
        }
    }


    public void addCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {

            if (this.garage[i] == null) {
                this.garage[i] = car;

                System.out.println("Add " + car.model + " " + car.producer + " " + car.yearOfProduction + " to garage");
                i = this.garage.length;
            } else {
                if (i == this.garage.length - 1) {
                    System.out.println("Garage to Small  !!!!");
                }
            }
        }
    }


   public double getValuee() {
       double sumCarValuee = 0.0;

        for (Car car : garage) {
            if (car != null) {
                sumCarValuee += car.value;
            }
        }
        return sumCarValuee;
    }

    public void List(){
        Arrays.stream(this.garage).sorted();
        for (Car car : garage) {
            if (car != null) {
                System.out.println(car.model);
            }
    }

}

    public int carInGarageNumber() {
        int i = 0;
        for (Car car : garage) {
            if (car != null) {
                i += 1;
            }
        }
//        System.out.println("IIIII " + i);
        return i;
    };

    public void carInGarageList(){
        if (carInGarageNumber() > 0){
            for (int i = 0; i < garage.length; i++) {
                if (this.garage[i] != null) {
                    System.out.println(garage[i]);
                }
            }

        } else {
            System.out.println("Empty garage ");
        }

    }


    class sortByYear implements Comparator<Car> {
        public int compare(Car x, Car y){
            if (x != null &&  y != null)
            return x.yearOfProduction - y.yearOfProduction;
            else return  0;
        }
    }

    public void carInGarageListSort(){
        if (garage.length != 0) {
            Arrays.sort(this.garage, new sortByYear());
            for (int i = 0; (i < garage.length) && (garage[i] != null); i++) {

                System.out.println(garage[i]);
            }
        }
        //else {System.out.println("Empty garage ");}
    }

}


