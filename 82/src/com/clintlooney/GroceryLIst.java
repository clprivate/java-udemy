package com.clintlooney;

import java.util.ArrayList;

public class GroceryLIst {
    private ArrayList<String> groceryList = new ArrayList<String>(); // The reason we have () at the end is that the ArrayList is actually a class.

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryLIst() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("Item " + (i + 1) + ": " + groceryList.get(i));
        }
    }

    // Add array list item
    public void modifyGroceryLIst(int position, String newItem) {
        groceryList.set(position, newItem); // Add array list item
        System.out.println("Grocery item" + (position + 1) + " added: " + newItem);
    }

    // Remove array list item
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position); // Remove array list item
        System.out.println(theItem = " removed from grocery list position" + (position + 1));
    }

    // Find array list item
    public String findItem(String searchItem) {
        // boolean exists = groceryList.contains(searchItem); // Search array list Find array list item
        int position = groceryList.indexOf(searchItem); // Find array list item index
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
