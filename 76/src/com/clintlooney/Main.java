package com.clintlooney;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        int[] myVariable; // Standard array definition.
//        myVariable = new int [10]; // The number of elements you want in the array--in this case, an array of 10 ints.
        // Or, preferably, you can combine both tasks onto one line:
//        int[] myIntArray = new int [10];

        // Assigning element values one by one
//        myIntArray[0] = 45; // Assign the 6th array element the int value of 50.
//        myIntArray[1] = 476;
//        myIntArray[5] = 50;

        // Assigning multiple element values:
//        int myIntArray[] = {1,2,3,4,5,6,7,8,9,10}; // This can only be done at the point you first define the array as a variable.
        // The bit inside the curly {} is called the "initializer block".

        // A third way to initialize an array:

//        int[] myIntArray = new int[25];
//        // Initializing array elementsw with a for loop:
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);



//        // Printing element values:
//        System.out.println(myIntArray[0]);;
//        System.out.println(myIntArray[6]);;
//        System.out.println(myIntArray[8]);;

        double myDoubleArray[] = new double[10];
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Value typed for element " + i + " was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values:\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i ++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
