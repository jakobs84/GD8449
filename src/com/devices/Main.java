package com.devices;

import creatures.Animal;
import creatures.Pet;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public Main() { /* compiled code */ }

    public static void main(String[] args) {

  // Task 1
       Pet dog = new Pet("canis", "Szarik");
       Pet cat = new Pet("whisky", "Lew");
        //dog.species = "pies";
        //dog.age = 8;


  //    Task 2

        dog.feed();
      //  dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();

        Human kacper = new Human();
        kacper.firstName = "Kacper";
        kacper.lastNam = "Brzęczyszczykiewiscz";
        kacper.age = 21;
        kacper.pet = dog;

        Human zbuj = new Human();
        zbuj.firstName = "Jakub";
        zbuj.lastNam = "Lenkodoly";
        zbuj.age = 33;
        zbuj.pet = cat;


  //      Task 3 i 4
/*
        kacper.setSalery(-12.1);
        kacper.setSalery(33.3);
        kacper.getSalery();
*/

  //    Task 5

        Disel bryka = new Disel("Honda", "Crv", 2021,120.1) ;

        kacper.setSalery(65.3);
        kacper.getSalery();
       // kacper.setVehicle(bryka, kacper);


        System.out.println(new Disel("Homer", "T1", 1984,120.1) .equals(new Disel("Homer", "T1", 1984,120.1)));
        System.out.println(new LPG("Homer", "T1", 1984,120.1) .equals(new LPG("Homer2", "T2", 1882, 120.1)));

        System.out.println(kacper);
        System.out.println(zbuj);

   //   Task 7
        bryka.turnOn();
        Phone nokia = new Phone("Nokia", "8210", 1999);
        nokia.turnOn();
        System.out.println(nokia);

    // Task 8

        Disel zlomek = new Disel("Honda", "HRV", 2022,150.1) ;
        Disel zlomek2 = new Disel("Honda", "CRX", 1984, 120.1) ;

        zbuj.setSalery(220.1);

        kacper.phone = nokia;
        kacper.setVehicle(zlomek, kacper);
        kacper.setVehicle(zlomek2, kacper);
        zbuj.casch = 180.1;
        //kacper.casch = 0.1;

        System.out.println();



        zlomek.sell(zbuj,kacper,140.1);
        zlomek2.sell(zbuj,kacper,5.0);
        nokia.sell(zbuj,kacper,20.1);
        kacper.sell(zbuj,kacper,33.1);


        System.out.println();

    // Task 10
        List<String> appNames = new LinkedList<>();
        appNames.add("Facebook");
        appNames.add("Youtube");
        appNames.add("Prosiak");

        //nokia.installAnApp(appNames);
        nokia.installAnApp("Andrew","2.0");
        //nokia.installAnApp("Andrew","2.0","wsb.gda.pl");

    // Task 11

     Human Bolek = new Human();
     Bolek.firstName = "Bolek";
     Bolek.lastNam = "Lolek";

    System.out.println("The value of stables : " + zbuj.getValuee());

     System.out.println("Garage list:");
     kacper.carInGarageList(); //Empty
     zbuj.carInGarageList();
     System.out.println("Sort Garage list by year of produc car:");
     kacper.carInGarageListSort();
     zbuj.carInGarageListSort();

     System.out.println(zlomek.producer + " " +zlomek.model + " wsa sold :" + zlomek.carOwnersCount());
     System.out.println(zlomek2.producer + " " +zlomek2.model + " wsa sold :" + zlomek2.carOwnersCount());

     zlomek.carOwnerWas(kacper);
     zlomek2.carOwnerWas(Bolek);


     zlomek.carOwnerList(kacper,zbuj);
     zlomek.carOwnerList(zbuj, kacper);
     zlomek.carOwnerList(kacper,Bolek);

     zlomek2.carOwnerLast(zbuj);
     zlomek2.carOwnerLast(kacper);



        }



 ;






}
