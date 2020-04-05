package com.sda.intro;

import java.util.Arrays;

public class DemoArrays {

    public static void main(String[] args) {
//        printEmptyArray();
//        printArrayWithInitialValues();
//        print2DArrayWithInitialValues();
//        iterateArray();
        fillArrayWithValues();
    }

    // empty array
    // add values to array
    // print values
    private static void printEmptyArray() {
        // String = sir de caractere
        // "temp"  -> 't' 'e' 'm' 'p'

        // create empty array with size 3
        String[] names = new String[3];
        names[0] = "ana";
        names[1] = "alex";
        names[2] = "paul";
//        names[3] = "gabi"; // index out of bounds

        // CTRL + D = duplicate line
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // save alex from the array to a variable
        //                  array name [ index of alex]
        String alexName = names[1];
        System.out.println("item at index 1 = " + alexName);
    }

    private static void printArrayWithInitialValues() {
        // create array with initial values
        //                      0   1   2   3
        int[] temperatures = {25, 30, 24, 20};

        int tuesdayTemp = temperatures[1];
        System.out.println("temperature on Tuesday was " + tuesdayTemp + " degrees");

//        int fridayTemp = temperatures[4];
//        System.out.println("temperature on Friday was " + fridayTemp + " degrees");
    }

    // 2D array with initial values
    // print values
    /*
        {1   2} {3   4}
     */
    private static void print2DArrayWithInitialValues() {
        int[][] coordinates = {{1, 2}, {3, 4}};
        int[] firstSet = coordinates[0];

        // variable = array [index]
        // 2nd element of firstSet
        int positionX = firstSet[0];
        int positionY = firstSet[1];

        System.out.println("x = " + positionX);
        System.out.println("y = " + positionY);

        // replace index 1,0 with value 5
        int[] secondSet = coordinates[1];
        System.out.println("initial value for index 1,0 = " + secondSet[0]);
        secondSet[0] = 5;
        System.out.println("value after update for index 1,0 = " + secondSet[0]);
    }

    private static void iterateArray() {
        // create array of numbers
        // array of integers - name of array = { elements }

        //                0  1  2  3  4
        int[] numbers = {3, 2, 6, 7, 4};

        // iterate array
        // for ( from index ; to index ; increment
        // i = i + 1  --> i++
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    // fill an array with a particular value
    private static void fillArrayWithValues() {
        int[] myArray = new int[40];

        // fills my array with value 5
        Arrays.fill(myArray, 5);

        // iterate and then print
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
