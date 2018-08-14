package com.clintlooney;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryLIst groceryLIst = new GroceryLIst();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter menu selection: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryLIst.printGroceryLIst();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    private static void printInstructions() {
        System.out.println("\nType ");
        System.out.println("\t 0 - to print choice options");
        System.out.println("\t 1 - to print grocery items list.");
        System.out.println("\t 2 - to add an item to the list.");
        System.out.println("\t 3 - to modify a list item.");
        System.out.println("\t 4 - to remove a lis5t item.");
        System.out.println("\t 5 - to search list for an item.");
        System.out.println("\t 6 - to exit the application.");
    }

    public static void  addItem() {
        System.out.print("Enter grocery item to add: "); // What happens when you get rid of the ln in println?
        groceryLIst.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter the number of the item you want to modify: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryLIst.modifyGroceryLIst(itemNo - 1, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter the number of the item you want to remove: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryLIst.removeGroceryItem(itemNo -1);
    }

    public static void searchForItem() {
        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryLIst.findItem(searchItem) != null) {
            System.out.println(searchItem + " present in list");
        } else {
            System.out.println(searchItem + " not present in list");
        }
    }
}