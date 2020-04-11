package com.sda.oop.constructor;

public class DemoConstructor {

    public static void main(String[] args) {

        // 1. create object and set values

        // instantiate class = create object
        // Phone = class (template)
        // phone = instance (object)
        Phone phone = new Phone();
        phone.brand = "iphone";
        phone.color = "silver";
        phone.yearOfFabrication = 2020;

        Phone samsung = new Phone("android", "green");
        System.out.println(samsung);
        Phone xiaomi = new Phone("xiaomi", "black");
        System.out.println(xiaomi);

        // CTRL + P - show parameter list
        Phone newPhone = new Phone();

        Laptop laptop = new Laptop();
        System.out.println(laptop);

        Laptop laptopWithValues = new Laptop("hp");
        System.out.println(laptopWithValues);
    }
}
