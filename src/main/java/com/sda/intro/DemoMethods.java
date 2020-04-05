package com.sda.intro;

public class DemoMethods {

    public static void main(String[] args) {
//        printMyAge();
//        printMyName();
//        int result = getSumOfTwoNumbers();
//        System.out.println("the result = " + result);

        int subtraction1 = subtractTwoNumbers(6, 3);
        int subtraction2 = subtractTwoNumbers(7, 2);
        int subtraction3 = subtractTwoNumbers(3, 9);
        System.out.println(subtraction1);
        System.out.println(subtraction2);
        System.out.println(subtraction3);

    } // end main()


    // print my name

    // query = interogare

    // command = comanda

    // private = access modifier
    // void = return type
    // printMyName = method name
    private static void printMyName() {
        System.out.println("cosmin");
        System.out.println("dan");
        System.out.println("bucur");
    }

    // print my age
    private static void printMyAge() {
        int years = 32;
        int months = 11;

        System.out.println("my age is " + years + " years and " + months + " months");
    }

    // method with return type
    // sum of two numbers

    // method signature
    private static int getSumOfTwoNumbers() {
        printMyAge();

        // method body
        int number1 = 3;
        int number2 = 5;
        int sum = number1 + number2;
        return sum;
    }

    // method with parameters
    // subtract two numbers
    // type name                (param type param name, param type param name)
    private static int subtractTwoNumbers(int number1, int number2) {
        int result = number1 - number2;
        return result;
    }
}
