package com.sda.oop.variablescope;

public class DemoVariableScope {

    public static void main(String[] args) {
        callInstanceVariable();
        callStaticVariable();
    }

    private static void callInstanceVariable() {
        // instance is needed
        Bike bike1 = new Bike();
        Bike bike2 = new Bike();

        // access instance variable
        bike1.brand = "cube";
        System.out.println("bike1.brand = " + bike1.brand);

        bike2.brand = "kona";
        System.out.println("bike2.brand = " + bike2.brand);
    }

    private static void callStaticVariable() {
        // instance is not needed

        // access class variable / static variable
        System.out.println("class variable = " + Bike.numberOfWheels);

        Bike.material = "metal";    // static / class variable
//        Bike.numberOfWheels = 4;  // final variable can not be modified

        System.out.println("Bike.material = " + Bike.material);
    }
}
