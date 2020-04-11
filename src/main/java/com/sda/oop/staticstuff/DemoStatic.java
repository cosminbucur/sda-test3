package com.sda.oop.staticstuff;

public class DemoStatic {

    public static void main(String[] args) {
        // call static method

        // Class.method()
        int result = Calculator.add(2, 3);
        System.out.println(result);

        // call non static method
        Calculator myCalculator = new Calculator();

        // reference.method()
        myCalculator.greeting();
    }
}
