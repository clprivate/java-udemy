package com.clintlooney;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter:\r");
            System.out.println("0 to print menu options\r");
            System.out.println("1 to print contact list\r");
            System.out.println("2 to add a contact\r");
            System.out.println("3 to search a contact\r");;
            System.out.println("4 to modify a contact\r");
            System.out.println("5 to remove a contact\r");
            System.out.println("6 to quit");
            int input = scanner.nextInt();
            switch(input) {
                case 0:
                    // print menu
                    break;
                case 1:
                    // Print contact list
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    // Search for contact
                    break;
                case 4:
                    // Modify contact
                    break;
                case 5:
                    // Remove contact
                    break;
                case 6:
                    System.out.println("Exiting program");
                    flag = false;
                    break;
            }
        }
    }

    public static void addContact() {
        // Collect contact info
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter contact number");
        int number = scanner.nextInt();
        MobilePhone.addContact(name, number);
    }
    // Remove contact
    // Search contact
    // Check contact exists
}
