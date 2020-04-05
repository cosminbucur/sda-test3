package com.sda.intro;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {
        // read name and age from user input

        // type variable name = new type
        // scanner - object reference
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");

        String userInput = scanner.nextLine();
        System.out.println("welcome " + userInput);

        System.out.println("what is your age?");
        int userAge = scanner.nextInt();
        System.out.println("your age " + userAge + " is very nice");

        scanner.close();
    }
}
