package com.clintlooney;

import org.omg.CORBA.portable.ValueOutputStream;

import javax.sound.midi.Soundbank;
import java.awt.image.VolatileImage;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in); // ? Why is this private static?
    private static MobilePhone mobilePhone = new MobilePhone("(719)686-4078");

    public static void main(String[] args) {
	// write your code here
    }

    boolean quit = false;
    // TODO
    startPhone();
    // TODO
    quitActions();

    while(!quit) {
        System.out.println("Pick action (6 to display options)");
        int action = scanner.nextInt();
        scanner.nextLine();
        switch(action) {
            case 0:
                System.out.println("Shutting down");
                quit = true;
                break;
            case 1:
                mobilePhone.printContacts();

                break;
            case 2:
                addNewContact():
                break;
            case 3:
                updateContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                queryContact();
                break;
            case 6:
                printActions();
                break;
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact's name:");
        String name = scanner.nextLine();
        System.out.println("Enter new contact's phone: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: ");
            System.out.println("Name = " name + ", phone = " + phone);
        } else {
            System.out.println("Can't add contact for " + name + ". Already on file.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter the name of the contact you want to replace");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("No entry with that name found");
            return;
        }

        System.out.println("Enter new contact's name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact's phone number:");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);

        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error encountered while updating record");
        }
    }

    private static void removeContact() {
        System.out.println("Enter name of contact you wish to delete:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.(name);
        if(mobilePhone.removeContact(contact)) {
            System.out.println("Contact successfully removed");
        } else {
            System.out.println("Error removing contact");
        }
    }


    public static void startPhone() {
        System.out.println("Starting phone");
    }

    public static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shut down\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n"
                "3 - to update an existing contact\n" +
                "4 - to remove a contact\n" +
                "5 - to query if a contact already exists\n" +
                "6 - to print a list of available actions"
        );
    }
}
