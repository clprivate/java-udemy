package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 50;
        // Be mindful the L comes after each instance of a long-type number.
        // If you put a byte or short value in brackets, it will be converted to an int, and a var of type long will accept an int.
        long longVar = 50_000L + 10L * (byteVar + shortVar + intVar);
        System.out.println(longVar);

        short shortTotal = (short) (byteVar + intVar + shortVar);
    }
}
