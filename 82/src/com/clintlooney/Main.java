package com.clintlooney;

import java.util.ArrayList;
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
                    processArrayLIst();
                case 7:
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
        System.out.print("Enter the item you want to replace: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryLIst.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter the item you want to remove: ");
        String itemNo = scanner.nextLine();
        groceryLIst.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryLIst.onFile(searchItem)) {
            System.out.println(searchItem + " present in list");
        } else {
            System.out.println(searchItem + " not present in list");
        }
    }

    public static void processArrayLIst() {
        // Add the entire contents of the grocery list to a new array.
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryLIst.getGroceryList()); // ~Technique: copy array list

        ArrayList<String> nextArray = new ArrayList<String>(groceryLIst.getGroceryList()); // Creates a new arrayList initialized to the contents of the old arrayLIst.

        // Converting the contents of the arrayList into a regular array:
        String[] myArray = new String[groceryLIst.getGroceryList().size()]; // Initialize the array to the size of the old arrayList.
        myArray = groceryLIst.getGroceryList().toArray(myArray);

    }
}