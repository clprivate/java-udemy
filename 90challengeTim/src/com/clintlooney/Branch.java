package com.clintlooney;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>(); // Creates the branch ready to accept a customer list, but does not populate that list on construction.
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() { return customers; }

    public boolean newCustomer (String customerName, int initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName,initialAmount)); // ~Technique: add arrayList element.
            System.out.println("New customer added");
            return true;
        }
        System.out.println("Customer already exists. Cancelling addition.");
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            System.out.println("Transaction added");
            return true;
        }
        System.out.println("Customer name not found. Cancelling transaction.");
        return false;
    }

    private Customer findCustomer(String customerName) { // This is private because it's only used internally to the Branch class.
        for (int i = 0; i < customers.size(); i++) { // ~Tip: .size() is a mthod. Do not forget the ().
            Customer checkedCustomer = this.customers.get(i); // ~Example: Deduplicating code.
            if(checkedCustomer.getName().equals(customerName)) { // ~~TECHNIQUE: FIND ARRAYLIST ITEM.
                return checkedCustomer;
            }
        }
        return null;
    }

}
