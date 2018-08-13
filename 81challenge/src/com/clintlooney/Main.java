package com.clintlooney;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Choose how many elements:");
        int[] testArray = enterArray(scanner.nextInt());
        System.out.println("Starting array: " + Arrays.toString(testArray));
        reverse(testArray);
        System.out.println("Reversed array: " + Arrays.toString(testArray));
    }

    private static int[] enterArray(int count) {
        System.out.println("Enter " + count + " integers:");
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private static void reverse(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i];
            array[array.length - i] = temp;
        }
    }
}
