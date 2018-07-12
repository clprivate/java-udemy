package com.clintlooney;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        while(true) {
            System.out.println("Enter a number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                } else {
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                }
            } else {
                System.out.println("Invalid input.");
                break;
            }
            scanner.nextLine();
        }
        if (first) {
            System.out.println("No valid minimum or maxiimum values entered. Ending program.");
        } else {
            System.out.println("Minimum value entered: " + min);
            System.out.println("Maximum value entered: " + max);
        }
        scanner.close();
    }
}
