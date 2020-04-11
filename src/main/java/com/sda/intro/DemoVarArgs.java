package com.sda.intro;


public class DemoVarArgs {

    public static void main(String[] args) {
        printNumbers();
        printNumbers(2, 4);
        printNumbers(3, 5, 6);
    }

    // method with variable arguments
    private static void printNumbers(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("no numbers to print");
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
