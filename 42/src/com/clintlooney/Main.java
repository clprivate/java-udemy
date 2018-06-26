package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));
        for (int i = 1; i < 6; i++) {
            System.out.println("Loop " + i);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
