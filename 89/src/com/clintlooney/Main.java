package com.clintlooney;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[10];
        String[] stringArray = new String[10];
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Clint"); // Add name to the array list
        // You can't make an int array list, because array lists can't be of primitive types. Does not accept primitive type arguments. Class reference is needed to save to an arrayList.
        // We could do the following, but won't because it's too clunky:
//        ArrayList<IntClass> inClassArrayList = new ArrayList<IntClass>();
//        inClassArrayList.add(new IntClass(54));
        // Instead, just use autoboxing:
        Integer integer = new Integer(54); // Integer, unlike int, is a class.
        Double doubleValue = new Double(12.25); //We name it doubleValue because double is already a JHava keyword.

        ArrayList<Integer> intArrayList = new ArrayList<Integer>(); // This time it works, because Integer is a valid class.
        for(int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i)); // Integer.valueOf takes the value of the primitive int i and converts it into the Integer class so we can use it in an int ArrayList.
            // The "Integer.valueOf(i)" part is autoboxing.
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); // .intValue converts the value of i from an Integer class back to an int primitive.
            // The "(i).intValue()" part is unboxing.
        }

        // ~Technique: There's a quickier way to autobox and unbox:
        Integer myIntValue = 56; // Shorter version of "Integer myIntValue = Integer.valueOf(56);
        int myInt = myIntValue; // Shorter version of "int myInt = myIntValue.intValue();"

//        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
//        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
//            myDoubleValues.add(Double.valueOf(dbl)); //
//        }
//
//        for(int i = 0; i < myDoubleValues.size(); i++) {
//            double value = myDoubleValues.get(i).doubleValue();
//            System.out.println("Index " + i + " = " + value);
//        }

        // Shortcut of the above:
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl); // Removed double
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i)/*.doubleValue()*/; // Removed doubleValue
            System.out.println("Index " + i + " = " + value);
        }
    }
}
