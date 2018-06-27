package com.clintlooney;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
//        System.out.println(sumDigits(-1));
//        System.out.println(sumDigits(0));
//        System.out.println(sumDigits(9));
//        System.out.println(sumDigits(10));
//        System.out.println(sumDigits(999));\
        System.out.println(isPalindrome(111));
        System.out.println(isPalindrome(119));
    }

    private static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        } else {
            while (number > 0) {
                // Extract the least significant digit.
                int currentDigit = number % 10;
                sum += currentDigit;
                System.out.println("Adding " + currentDigit);
                // Drop the least significant digit.
                number /= 10;
            }
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int tempNum = number;
        while (tempNum > 0) {
            System.out.println("Tempnum = " + tempNum);

            // Extract least significant digit.
            int lastDigit = tempNum % 10;
            System.out.println("Last digit: " + lastDigit);


            //
            reverse *= 10;
            reverse += lastDigit;
            System.out.println("Reverse: " + reverse);

            // Remove least significant digit.
            tempNum /= 10;
            System.out.println("\n");
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
