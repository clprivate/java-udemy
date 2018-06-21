package com.clintlooney;

public class Main {

    public static void main(String[] args) {

        int switchValue = 1;

        switch (switchValue) {

            case 1:
                System.out.printf("Value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was 3, 4, or 5");
                break;

            default:
                System.out.println("Was not 1 or 2.");
                break;
        }
    }
}
