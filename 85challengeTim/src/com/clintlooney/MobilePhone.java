package com.clintlooney;

public class MobilePhone {
    private String myNumber;
    private ArrayLIst<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        // Initialize the ArrayLIst. The constructor is usually the right place to do this.
        this.myContacts = new ArrayLIst<Contact>(); // Creates an empty array list. How create ArrayList with preelements already in it?
    }

    public boolean addNewContact(Contact contact) { // We're not setting the name and number, we're sending the method a Contact that's been created outside.
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            System.out.printf("Contact not added");
            return false;
        }
        myContacts.add(contact);
        System.out.println("Contact added");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " repalced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println("Contact not on file");
            System.out.println("Nothing to remove - removal cancaeled");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was removed");
        return true;
    }

    // Implement two findContact methods, overloading one of them. One will return the index position The other finds the actual name in the list.
    private int findContact(Contact contact) {
        this.myContacts.indexOf(contact); // Returns integer telling us index of that contact in the array.
    }

    private int findContacts(String contactName) {
        for (int i = 0; i < this.myContacts.size; i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    // ? Learn the difference between getting and querying.
    // Query as the public method to allow other classes to interact with contacts.
    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }
}
