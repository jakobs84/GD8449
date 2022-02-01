package com.devices;

public class LPG extends Car{
    public LPG(String producer, String model, Double value) {
        super(producer, model, value);
    }

    @Override
    public void Refuel() {
        System.out.println("Gass Full");
    }
}
