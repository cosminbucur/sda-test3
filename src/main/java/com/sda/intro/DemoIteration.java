package com.sda.intro;

public class DemoIteration {

    public static void main(String[] args) {
        int[] evenNumbers = {4, 2, 6};
        int[] oddNumbers = {3, 1, 7};
        String[] cars = {"audi", "bmw", "ferrari"};
        int[] strangeNumbers = {4, 2, 6, 2, 7, 2, 5};

//        iterateUsingFor(evenNumbers);   // call method with param
//        iterateUsingFor(oddNumbers);   // call method with param
//
//        iterateUsingFor(cars);          // call method with param

//        printElementsOnTheSameLine(evenNumbers);
//        continueOnValue(strangeNumbers);
//        breakOnValue(strangeNumbers);

        iterateUsingForEach(strangeNumbers);
    }

    // iterate any array and print each value
    private static void iterateUsingFor(int[] array) {  // define method with param
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);          // 0, 1, 2
            System.out.println(array[i]);   // 4, 2, 6
        }
    }

    private static void iterateUsingFor(String[] array) {  // define method with param
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // write elements one after another
    private static void printElementsOnTheSameLine(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                result = result + array[i];
            } else {
                result = result + ", " + array[i];
            }
        }
        System.out.println(result);
    }

    // skip value 2
    private static void continueOnValue(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                continue;
            }

            result = result + " " + array[i];
        }
        System.out.println(result);
    }

    // break when value found
    private static void breakOnValue(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                break;
            }
            result = result + " " + array[i];
        }
        System.out.println(result);
    }

    // iterate using for each
    private static void iterateUsingForEach(int[] array) {
        // for (element type element name : collection)
        for (int element : array) {
            System.out.println(element);    // array[i]
        }
    }
}
