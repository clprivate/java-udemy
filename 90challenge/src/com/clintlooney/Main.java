package com.clintlooney;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        boolean quit = false;
        while(!quit) {
            runMenu();
        }
        System.out.println("Application closed");
    }

    private static void newBank(String bankName) {
        Bank bank = new Bank(bankName);
    }

    private void runMenu() {
        System.out.println("Select from menu: ");
        System.out.println(
                "0 to re-print menu options" +
                        "1 to " +
                        "2 to " +
                        "3 to " +
                        "4 to ");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch(input) {
            case 0:
                //
                break;
            case 1:
                //
                break;
            case 2:
                //
                break;
            case 3:
                //
                break;
        }
    }
}
