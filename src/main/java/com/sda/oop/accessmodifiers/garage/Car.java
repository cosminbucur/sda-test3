package com.sda.oop.accessmodifiers.garage;

public class Car {

    public String brand;
    protected int fuelCapacity = 40;

    public void drive() {
        refillTank();
        startIgnition();
        System.out.println("car is driving");
    }

    private void startIgnition() {
        System.out.println("starting ignition");
    }

    protected void refillTank() {
        System.out.println("refilling tank");
    }

    void enableAlarm() {
        System.out.println("enabling alarm");
    }
}
