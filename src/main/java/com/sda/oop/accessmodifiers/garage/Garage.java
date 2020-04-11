package com.sda.oop.accessmodifiers.garage;

public class Garage {

    // has a car
    public Car car; // define reference

    public ElectricCar electricCar;

    public void openGarage() {
        car = new Car();    // create new instance (object)
        car.fuelCapacity = 50;  // protected field
        car.refillTank();   // protected method
        car.enableAlarm();  // default method

        electricCar = new ElectricCar();
        electricCar.rechargeBattery();
        electricCar.brand = "tesla";
        electricCar.refillTank();   // protected method
        electricCar.enableAlarm();  // default method
    }
}
