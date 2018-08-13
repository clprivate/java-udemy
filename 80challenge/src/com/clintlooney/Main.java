package com.clintlooney;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        // Remember why this is necessary/?
        scanner.nextLine();
        int[] testArray = readIntegers(count);
        System.out.println("Min = " + findMin(testArray));
    }

    private static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integers");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minVal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minVal) {
                minVal = array[i];
            }
        }
        return minVal;
    }
}
