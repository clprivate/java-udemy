package com.clintlooney;

public class Main {

    public static void main(String[] args) {
	    // Float = single-precision floating-point number.
        // To declare a float, you must cast it as a float.
        // float floatVar = (float) 5.4;  //Second best way to do it.
        // float floatVar = 5.4f; // Best way to do it.

        int intVar = 5 / 3;
        float floatVar = 5f / 3f;
        double doubleVar = 5d / 3d    ;

        System.out.println("int var=" + intVar);
        System.out.println("float var=" + floatVar);
        System.out.println("double var=" + doubleVar);

        // Double = double-precision floating-point number. This means it's got twice as much detail as a float.
        // Enter a number with a decimal point on the right side of an expression, and Java will automatically type it as a double.
        // Put a d after doubles to indicate they are double precision floating point numbers.
    }
}
