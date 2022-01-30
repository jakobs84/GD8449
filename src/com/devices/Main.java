package com.devices;

public class Main {
    public Main() { /* compiled code */ }

    public static void main(String[] args) {

  // Task 1
        Animal dog = new Animal("canis", "Szarik");

        dog.species = "pies";
        dog.age = 8;
  /*    Task 2
        dog.feed();
        dog.takeForAWalk();
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
*/
        Human kacper = new Human();
        kacper.firstName = "Kacper";
        kacper.lastNam = "Brzęczyszczykiewiscz";
        kacper.age = 21;
        kacper.pet = dog;

        Car bryka = new Car("Honda", "Crv", 10.5 );
/*
  //      Task 3 i 4
  //      kacper.setSalery(-12.1);
  //      kacper.setSalery(33.3);
  //      kacper.getSalery();

 */
  //    Task 5
        kacper.setSalery(65.3);
        kacper.getSalery();
        kacper.setVehicle(bryka);

        System.out.println(new Car("Homer", "T1", 120.1).equals(new Car("Homer", "T1", 120.1)));
        System.out.println(new Car("Homer", "T1", 120.1).equals(new Car("Homer2", "T2", 120.1)));

        System.out.println(kacper);

    }
}
