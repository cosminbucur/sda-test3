package com.sda.oop.variablescope;

public class Bike {

    // constant
    public static final int numberOfWheels = 2;
    // static variable
    public static String material = "aluminum";
    // instance variable
    // access modifier type name
    public String brand;

    public void ride() {
        // local variable / block
        int numberOfKm = 20;
        System.out.println(brand + " riding for " + numberOfKm);
    }

    public void hitBreak() {
//        numberOfKm  // local variable from another method

        // instance variable
        System.out.println(brand + " is braking");
    }

}
