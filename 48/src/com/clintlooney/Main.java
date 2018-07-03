package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("String number: " + numberAsString);

        // String to int parsing
        int number = Integer.parseInt(numberAsString);
        System.out.println("Number: "+ number);


        // When we enter the below, Java will automatically contert the 1 from int to string and concatenate the two strings.
        numberAsString += 1;
        number += 1;
        System.out.println("String num 2: " + numberAsString);
        System.out.println("Number 2:" + number);

        // String to double parsing
        double numberAsDouble = Double.parseDouble(numberAsString);
        System.out.println("String to double: " + numberAsDouble);
    }
}
