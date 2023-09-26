package com.ironhack.w1.d1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello everyone!");


//      DATA TYPES

        byte myByte = 127;
        short myShort = 1000;
        int myInt = 999999;
        double myDouble = 12.3456;
        boolean myBoolean = true;
        char myChar = 98;

        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myChar: " + myChar);

        myInt = 1234;
        System.out.println("myInt: " + myInt);

        String myString = "Hello world";
        System.out.println(myString);


//        OPERATORS

        int number = 10;
        double doubleNumber = 10;

        int result = number + 10;
        System.out.println("Result: " + result);

        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 5);
        System.out.println(number / 3);
        System.out.println(doubleNumber / 3);
        System.out.println(number % 3);

//        These next 3 lines are equivalent
//        number = number + 1;
//        number++;
//        number += 1;

        System.out.println(number++);
        System.out.println(number);
        System.out.println(++number);


//        CONDITIONALS

        number = 1;

        if (number == 0) {
            System.out.println("Number is equal to 0");
        } else if (number >= 100 && number <= 1000) {
            System.out.println("Number is greater of equal that 100 and smaller or equal than 1000");
        } else {
            System.out.println("Number is different to 0 or lower than 100");
        }

        if (number >= 10 || number <= -10) {
            System.out.println("Number has more than two digits");
        }

        if (number % 2 == 0) System.out.println("Number is even");
        else System.out.println("Number is odd");

        if (myBoolean) System.out.println("myBoolean is true");



        // Switch
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }


        double mark = 6.5;
        boolean hasPassed = mark >= 5 ? true : false;


//        CALLING METHODS

        myMethod();
        myMethod();
        myMethod();

        String info = getInfo(10);
        System.out.println(info);


//        STRING METHODS

        String address = "Fake Street, 123";

        System.out.println("Address: " + address);
        System.out.println("Address lenght: " + address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.toUpperCase().replace("E", "-"));

        String address2 = "Fake Street, 123";

        if (address.equals(address2)) System.out.println("It's the same address");
        else System.out.println("They are different addresses");


//        WRAPPERS

        Integer myInteger = 100;
        System.out.println(myInteger);

    }


//    METHODS

    public static void myMethod() {
        System.out.println("This");
        System.out.println("is");
        System.out.println("inside");
        System.out.println("myMethod");
    }

    public static String getInfo(int option) {
        if (option == 1) return "My name is Adrián";
        else if (option == 2) return "This is an Ironhack bootcamp";
        return "option " + option + " provides no info";
    }
}