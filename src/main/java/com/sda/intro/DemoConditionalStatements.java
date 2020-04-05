package com.sda.intro;

public class DemoConditionalStatements {

    public static void main(String[] args) {
        // given 100 lei, when withdraw 200, then warning
        int total = 100;

//        int rest = withdraw(total, 200);
//        int anotherTry = withdraw(total, 50);
//        System.out.println(anotherTry);
//
//        testTernaryOperator();

        useSwitchToReplaceMultipleIfs(2);
    }

    private static int withdraw(int total, int amount) {
        // prevent withdraw more than total

        // if (expression) {
        //      execute
        // } else {
        //      execute something else
        // }

        // variable scope
        int result = 0;

        if (amount > total) {
            System.out.println("sorry. you only have " + total);
        } else {
            result = total - amount;
        }
        return result;
    }

    private static void multipleIfConditions() {
        String color = "blue";
        if (color.equals("blue")) {
            System.out.println("ok");
        } else if (color.equals("green")) {
            System.out.println("nice");
        } else if (color.equals("yellow")) {
            System.out.println("nice");
        } else {
            System.out.println("unknown color");
        }
    }

    private static void useSwitchToReplaceMultipleIfs(int number) {
        switch (number) {
            case 1:
                System.out.println("ok");
                break;
            case 2:
                System.out.println("nice");
                break;
            case 3:
                System.out.println("not ok");
                break;
            default:
                System.out.println("unknown number");
        }
    }

    private static void variableScope() {
        int y = 3;

        if (2 > 0) {
            // y is visible
            y = 6;

            int x = 5;
            x = 3;
        }
//        x = 6;  // x is not visible because it is defined in if block
    }

    private static void testTernaryOperator() {
        int result = 0;
        int a = 5;
        int b = 2;

        // expression ? do when true : do when false
        result = (a == b) ? 10 : 5;
        System.out.println(result);     // 5
    }
}
