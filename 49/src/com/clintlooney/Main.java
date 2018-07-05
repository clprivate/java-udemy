package com.clintlooney;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        boolean hasNextInt = scanner.hasNextInt(); // Checks if the next input entered is an integer.
        if (hasNextInt) {
            int birthYear = scanner.nextInt();
            scanner.nextLine(); // Handle enter key

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2018 - birthYear;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");

            }
        } else {
            System.out.println("Unable to parse birth year");
        }
        scanner.close();
    }
}
