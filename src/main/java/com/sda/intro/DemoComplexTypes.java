package com.sda.intro;

public class DemoComplexTypes {

    public static void main(String[] args) {
        compareObjects();
//        comparePrimitives();
//        compareStrings();
    }

    private static void defineComplexTypes() {
        Byte byteVariable = 120;
        Short shortVariable = -30000;
        Integer intVariable = 250000;   // *
        Long longVariable = 1000L;

        // numbers with decimals
        Float myFloat = 2.234F;         // 7 decimals
        Double myDouble = 5.23234242;   // 15 decimals

        Character myChar = 'c';         // *

        Boolean myBoolean = true;
    }

    private static void compareObjects() {
        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(500);
        System.out.println("hashcode = " + integer1.hashCode());

        System.out.println("compare references");
        if (integer1 == integer2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("compare values of references");
        if (integer1.equals(integer2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static void compareStrings() {
        System.out.println("compare strings");
        String name = "alex";
        String otherName = "alex";

        boolean areEqualReferences = name == otherName;
        System.out.println("references = " + areEqualReferences);   // false

        boolean areEqualValues = name.equals(otherName);
        System.out.println("values = " + areEqualValues);       // true
    }

    private static void comparePrimitives() {
        int integer1 = 500;
        int integer2 = 500;

        if (integer1 == integer2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static void primitiveVsObject() {
        Integer temperature = null;
        // 0 means something
        int primitiveTemperature = 0;
        System.out.println(primitiveTemperature);

        Boolean consent = null;
        boolean primitiveBoolean = false;
    }
}
