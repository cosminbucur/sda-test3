package com.sda.intro;

public class DemoOperators {

    public static void main(String[] args) {
        logicalOperators();

    }

    private static void logicalOperators() {
        // && AND   true && true
        boolean andOperatorTrue = (2 < 4) && (3 > 1);   // true && true => true
        System.out.println("andOperatorTrue = " + andOperatorTrue);

        boolean andOperatorFalse = (2 > 4) && (3 > 1);  // false && true => false
        System.out.println("andOperatorFalse = " + andOperatorFalse);

        // || OR    true || false
        boolean orOperatorTrue = (2 > 4) || (3 > 1);  // false || true => true
        System.out.println("orOperatorTrue = " + orOperatorTrue);

        boolean orOperatorFalse = (2 > 4) || (3 < 1);  // false || false => false
        System.out.println("orOperatorFalse = " + orOperatorFalse);

        // ! NOT        !true => false
        boolean notTrue = !(4 > 2);
        System.out.println("notTrue = " + notTrue);
    }

    private static void arithmeticOperators() {
        // arithmetic operators
        int a = 10;
        int b = 2;
        int c = 0;

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
//        int divByZero = a / c;  // division by zero exception

        a += b; // a = a + b;
        System.out.println("a = " + a); // 12

        a -= b; // a = a - b;
        System.out.println("a = " + a); // 10

        int i = 5;
        System.out.println(++i);    // 6
        System.out.println(i++);    // 6 ??
        System.out.println(i);      //7

        System.out.println(--i);    // 4
        System.out.println(i--);    // 4
        System.out.println(i);      // 3

        // % modulo - restul impartirii la un numar
        int moduloResult = 10 % 4;
        System.out.println(moduloResult);
    }
}
