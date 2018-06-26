package com.clintlooney;

public class Main {

    public static void main(String[] args) {
//        for (int i = 8; i >= 2; i--) {
//            System.out.println("$10K at " + i + "% interest = $" + String.format("%.2f",calculateInterest(10000,(double) i)));
//        }
        int primeCount = 0;
        for (int i = 10; i <= 50; i++) {
            if(isPrime(i)) {
                primeCount++;
                System.out.println(i + " is prime.");
                System.out.println("Prime counter: " + primeCount);
                if (primeCount == 3) {
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate /100);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if(n % 1 ==0) {
                return false;
            }
        }
        return true;
    }
}
