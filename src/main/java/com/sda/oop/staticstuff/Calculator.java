package com.sda.oop.staticstuff;

public class Calculator {

    // 1. variables

    // 2. constructor
    public Calculator() {
        // call local method
        startCalculator();

        // call local static method
        printVersion();
    }

    // 3. methods

    // static method
    public static int add(int a, int b) {
        return a + b;
    }

    public static void printVersion() {
        System.out.println("1.2");
    }

    // non static
    public void greeting() {
        System.out.println("hello from calculator");
    }

    // private
    private void startCalculator() {
        System.out.println("starting calculator");
    }
}
