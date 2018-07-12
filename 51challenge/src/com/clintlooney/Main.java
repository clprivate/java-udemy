package com.clintlooney;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while (true) {
            System.out.println("Enter integer " + counter + ":");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum+= number;
                if (counter > 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number.");
            }
            scanner.nextLine();
        }

        // Handle Enter key (end of line) or unforeseen input


        System.out.println("Total: " + sum);
        scanner.close();
    }
}
