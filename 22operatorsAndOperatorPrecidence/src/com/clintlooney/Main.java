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

        // Because of the possibility of mistakenly ussing an assignment operator in place of a comparison operator, it can be safer to just say if iscar
//        boolean isCar = false;
//        if (isCar) {
//            System.out.println("This isn't supposed to happen.");
//        }

        // Using the ternary operator:
        boolean wasCar = isCar ? true : false;
        // This means, if wasCar is equal to iscar, return true. If not, return false.
        // condition to evaluate ? what you'll do if it returns true : what you'll do if it returns false

    }
}
