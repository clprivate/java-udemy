package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        // Strings require double quotes.
        String myString = "No one cares.";
        System.out.println(myString);
        // Appending to Strings:
        myString += " Work harder.";
        System.out.println(myString);
        String numberString = "250.55";
        numberString += "49.95";
        System.out.println(numberString);
        // Using + operator with numeric strings performs concatenation, not addition.

        // Even using + operator with an int string and a proper int results in concatenation.
        // In this case, a string gets returned.
        String numString1 = "10";
        int intVar = 50;
        numString1 += intVar;
        System.out.println(numString1);
    }
}
