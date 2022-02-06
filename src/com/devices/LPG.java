package com.devices;

public class LPG extends Car{
    public LPG(String producer, String model, Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void Refuel() {
        System.out.println("Gass Full");
    }
}
