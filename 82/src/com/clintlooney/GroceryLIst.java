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
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    // Making this private means that users are forced to use the modify method that takes only the item string.
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem); // Add array list item
        System.out.println("Grocery item" + (position + 1) + " added: " + newItem);
    }

    // Remove array list item
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
            System.out.println(item + " removed from list");
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position); // Remove array list item
    }

    // Find array list item
    private int findItem(String searchItem) {
        // boolean exists = groceryList.contains(searchItem); // Search array list Find array list item
        return groceryList.indexOf(searchItem); // Find array list item index
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
