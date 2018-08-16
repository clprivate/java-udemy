package com.clintlooney;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) { // Static means you don't have to create a new instance of the Contact class.
        return new Contact(name, phoneNumber); // This is just calling the constructor to create a new Contact record.
    }
}
