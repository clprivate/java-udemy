package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        // ~~Technique: for loop alternative Iterator
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next()); // The i.next changes the value of the iterator.
        }
        System.out.println("=======================================");
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.println(linkedList.get(i));
//        }
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator(); // This does NOT automatically point to the firsdt record. You must use stringListIterator.next() to move it to the first record.
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            // 0 means the iterator and the city are equal.
            if (comparison == 0) {
                // They're equal. Don't add.
                System.out.println(newCity + " is already on the list");
                return false;
            } else if (comparison > 0) {
                // The new city should appear before this one.
                stringListIterator.previous(); // go back to the previous entry
                stringListIterator.add(newCity); // Add newCity before the "current" entry.
                return true;
            } else if (comparison < 0){
                // move on to next city
                // Brisbane comes after Adelaide, so the correct course is to move on.
                // We don't need to next, since that's part of the loop arleady.

                return false;
            }

            stringListIterator.add(newCity);
            return true;
        }
    }

}
