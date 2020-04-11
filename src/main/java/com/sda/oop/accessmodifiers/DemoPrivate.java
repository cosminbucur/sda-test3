package com.sda.oop.accessmodifiers;

import com.sda.oop.accessmodifiers.garage.Car;

public class DemoPrivate {

    public static void main(String[] args) {
        Car car = new Car();
//        car.startIgnition();    // can not call private method
        car.drive();
    }
}
