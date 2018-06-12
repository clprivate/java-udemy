package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        double doubleVar1 = 20d;
        double doubleVar2 = 80d;
        double doubleVar3 = (doubleVar1 + doubleVar2) * 25d;
        System.out.println("Total = " + doubleVar3);
        double doubleVar4 = doubleVar3 % 40d;
        System.out.println("Remainder = " + doubleVar4);
        if (doubleVar4 <= 20) {
            System.out.println("Total was over the limit.");
        }
    }
}
