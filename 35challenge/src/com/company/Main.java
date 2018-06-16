package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(1,6);
        calcFeetAndInchesToCentimeters(18);
        // This is how you use return values to throw error messages if necessary:
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters.");
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        // Validate input
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double centimeters = (feet * 12 + inches) * 2.54;
        System.out.println("Input: " + feet + " feet, " + inches + " inches\nOutput: " + centimeters + " centimeters.");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        // Validate input
        if (inches < 0) {
            return -1;
        }
        double centimeters = inches * 2.54;
        System.out.println("Input: " + inches + " inches\nOutput: " + centimeters + " centimeters.");
        return centimeters;
    }

}
