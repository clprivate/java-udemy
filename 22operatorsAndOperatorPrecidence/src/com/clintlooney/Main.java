package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        int intVar = 50;
        if (intVar == 50) {
            System.out.println("Intvar is 50.");
        }

        //Beware the below. Putting an equality operator instead of a comparison operator makes the if statement always evaluate to true, thus it prints the wrong ocntent.
        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This isn't supposed to happen.");
        }

        // Using the ternary operator:
        boolean wasCar = isCar ? true : false;

    }
}
