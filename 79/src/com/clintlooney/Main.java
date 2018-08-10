package com.clintlooney;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Value types
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("MyIntValue: " + myIntValue);
        System.out.println("AnotherIntValue: " + anotherIntValue);

        System.out.println("Incrementing anotherIntValue");
        anotherIntValue++;

        System.out.println("MyIntValue: " + myIntValue);
        System.out.println("AnotherIntValue: " + anotherIntValue);


        // Array types
        // Here, "myIntArray" is a reference. A reference holds the address of an object, but not the object itself.
        // So myIntArray holds a reference, or an address, of an array in memory.
        // With a reference type, we're using a reference to control the object in memory, because we can't access that object directly.
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherArray));

        System.out.println("Altering anotherArray.");
        anotherArray[0] = 1;

        anotherArray = new int[] {4,5,6,7,8}; // Now there are 2 different references, and 2 different arrays in memory.


        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherArray));
        // Both references point to the same array in memory, so altering either of them alters both.

        // The same thing happens when passing a reference type to a method. The address is copied to a parameter.Now we've got 3 references to the same array.
        modifyArray(myIntArray);
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherArray));

        // A method cannot modify a reference, it can only dereference it.

    }

    public static void modifyArray(int[] array) {
        array[1] = 2;
        array = new int[] {1,2,3,4,5};
        // Now the parameter reference, "array", points to a DIFFERENT array than it used to, because we used the "new" keyword.
        // Once we use the = sign, we're dereferencing the reference?
        // And a new array has been created in an area of memory that "array" now points to.
        // myIntArray and anotherArray are still are still referencing the original "array" and pointing to it.

    }
}
