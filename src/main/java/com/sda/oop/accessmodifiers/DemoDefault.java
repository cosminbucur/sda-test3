package com.sda.oop.accessmodifiers;

import com.sda.oop.accessmodifiers.garage.Car;

public class DemoDefault {

    public static void main(String[] args) {
        Car car = new Car();

        // can not call default method outside garage package
//        car.enableAlarm();

        car.drive();
    }
}
