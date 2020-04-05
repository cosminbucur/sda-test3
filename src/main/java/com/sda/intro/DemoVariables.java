package com.sda.intro;

// class name always with CapitalCase
public class DemoVariables {

    // declare variables (primitives)

    // type  name = value
    byte byteVariable = 120;
    short shortVariable = -30000;
    int intVariable = 250000;
    long longVariable = 1000L;

    // numbers with decimals
    float myFloat = 2.234F;         // 7 decimals
    double myDouble = 5.23234242;   // 15 decimals

    char myChar = 'c';

    boolean myBoolean = true;

    // method area
    public static void main(String[] args) {
        // variable name always with lower case
        byte studentNumber = 121;
        short millage = 25000;
        int accountMoney = 2000000;
        long currentDateInEpoch = 158594567L;

        float temperature = 20.507F;
        double pi = 3.14678657656565556;
        char lastLetter = 'z';

        boolean isInfected = false;
        boolean isTeenager = true;

        System.out.println("isTeenager: " + isTeenager);
        System.out.println("current date is " + currentDateInEpoch);
    }
}
