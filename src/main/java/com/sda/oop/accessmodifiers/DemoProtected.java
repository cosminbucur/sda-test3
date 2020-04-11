package com.sda.oop.accessmodifiers;

import com.sda.oop.accessmodifiers.garage.Car;
import com.sda.oop.accessmodifiers.garage.ElectricCar;

public class DemoProtected {

    public static void main(String[] args) {
        Car car = new Car();
//        car.fuelCapacity;   // this class is not in the same package
//        car.refillTank();   // this method is protected
        car.drive();    // public method

        ElectricCar electricCar = new ElectricCar();
        electricCar.drive();            // from car
        electricCar.brand = "tesla";    // from car
        electricCar.rechargeBattery();
//        electricCar.refillTank();   // protected method
    }
}

