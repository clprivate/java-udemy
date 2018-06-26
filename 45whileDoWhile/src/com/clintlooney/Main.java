package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {
            System.out.println("While count value: " + count);
            count++;
        }

        count = 1;
        while(true) {
            if (count > 5) {
                break;
            }
            System.out.println("While true count value: " + count);
            count++;
        }

        count =1;
        do {
            System.out.println("Do while count: " + count);
            count++;
        } while (count <= 5);
    }
}
