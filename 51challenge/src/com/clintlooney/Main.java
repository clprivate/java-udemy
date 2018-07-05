package com.clintlooney;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + i + ": ");
            total += scanner.nextInt();
            scanner.nextLine();

        }
        System.out.println("Total: " + total);

        scanner.close();

    }


}
