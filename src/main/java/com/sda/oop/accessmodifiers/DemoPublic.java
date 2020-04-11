package com.sda.oop.accessmodifiers;

import com.sda.oop.accessmodifiers.garage.Car;

public class DemoPublic {

    public static void main(String[] args) {
        // create an instance of an object

        // type reference = new constructor
        Car audi = new Car();
        audi.drive();   // call public method
//        audi.startIgnition();   // can not call private method

        Car bmw = new Car();
        bmw.drive();
    }
}
