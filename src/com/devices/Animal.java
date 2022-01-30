package com.devices;

public class Animal {

    String species;
    String name;
    Integer age;
    private Double weight;   //tu zrobic private
    Boolean alive;

    Animal(String species, String name) {
        this.species = species;
        this.name = name;
        this.alive = true;
        if (this.species == "canis") {
            this.weight = 10.0;
        } else if (this.species == "felis") {
            this.weight = 2.0;
        } else {
            this.weight = 1.0;
        }

        System.out.println(IntroduceYourSelf());
    }

    void feed() {
        ItAllive();
        if (alive) {
            weight += 1;
            System.out.println("Food, new weight:" + weight);
        }
    }


    void takeForAWalk() {
        ItAllive();
        if (alive) {
            weight -= 1;
            System.out.println("Walk, new weight:" + weight);
        }
    }



    void ItAllive() {
        if (weight <= 1) {
            alive = false;
            System.out.println("The animal died");
        }

    }


    String IntroduceYourSelf() {
        return "Im " + species + ", my name is " + name + " and my weight is " + weight + ".";

    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", alive=" + alive +
                '}';
    }
}