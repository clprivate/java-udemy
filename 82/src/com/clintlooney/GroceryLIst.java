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
}
