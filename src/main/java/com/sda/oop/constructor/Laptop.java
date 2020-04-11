package com.sda.oop.constructor;

public class Laptop {

    public String brand;

    // default constructor, hidden for every class
    public Laptop() {

    }

    // if you define this constructor, the default constructor has to be added manually
    public Laptop(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
            "brand='" + brand + '\'' +
            '}';
    }
}
