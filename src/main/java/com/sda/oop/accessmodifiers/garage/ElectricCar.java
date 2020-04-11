package com.sda.oop.accessmodifiers.garage;

public class ElectricCar extends Car {

    int batteryPercentage;

    public void rechargeBattery() {
        refillTank();   // protected method
        System.out.println("recharging battery");
    }
}
