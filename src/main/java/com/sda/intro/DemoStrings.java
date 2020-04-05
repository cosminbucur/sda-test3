package com.sda.intro;

public class DemoStrings {

    // String is an object
    public static void main(String[] args) {
        String emptyString = "";

        // 'a' 'l' 'e' 'x'
        String firstName = "alex";
        System.out.println("name " + firstName);

        String fullName = firstName + " " + "ionescu";

        System.out.println(fullName.toUpperCase());
        System.out.println("length = " + fullName.length());
    }
}
