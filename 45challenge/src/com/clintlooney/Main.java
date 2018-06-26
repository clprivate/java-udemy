package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int endNum = 20;
        int evenCount = 0;
        while (number <= endNum) {
            number ++;
            if (!isEven(number)) {
                continue;
            }
            System.out.println(number + " is even");
            evenCount ++;
            if (evenCount >= 5) {
                break;
            }
        }
        System.out.println("Even count: " + evenCount);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
