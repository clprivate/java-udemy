package com.clintlooney;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        // Add linkedlist item
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            //TODO System.out.println();
        }
    }
}
