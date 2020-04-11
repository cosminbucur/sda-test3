package com.sda.oop.constructor;

public class Phone {

    public String brand;
    public String color;
    public int yearOfFabrication;

    // constructor
    public Phone() {
        // 2. create constructor and hardcode values
        this.brand = "iphone";
        this.color = "silver";
        this.yearOfFabrication = 2020;
    }

    public Phone(String newBrand, String newColor) {
        this.yearOfFabrication = 2020;
        this.brand = newBrand;
        this.color = newColor;
    }

    public Phone(String brand, String color, int yearOfFabrication) {
        this.brand = brand;
        this.color = color;
        this.yearOfFabrication = yearOfFabrication;
    }

    @Override
    public String toString() {
        return "Phone{" +
            "brand='" + brand + '\'' +
            ", color='" + color + '\'' +
            ", yearOfFabrication=" + yearOfFabrication +
            '}';
    }
}
