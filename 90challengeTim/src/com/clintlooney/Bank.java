package com.clintlooney;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.lang.reflect.Array;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName)); //~~TECHNIQUE: ADD ARRAYLIST ITEM ADD ARRAYLIST ELEMENT
            return true;
        }
        System.out.println("Branch already exists");
        return false;

    }

    // TODO Might remove
    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        Customer newCustomer = branch.
            // TODO
        if (branch != null) {
                branch.add(customerName);
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                System.out.println("Branch found: " + branchName);
                return checkedBranch;
            }
            System.out.println("Branch not found");
            return null;
        }
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        ArrayList<Customer> branchCustomers = branch.getCustomers();

        if (branch != null) {
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer " + (i + 1) + ": " + branchCustomer.getName());
                if (showTransactions) {
                    System.out.println("Transactions for " + branchCustomer + ": ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("Transaction " + (j + 1) + ": " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            System.out.println("Branch not found");
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        // TODO
        Customer branchCustomer = branch.getCustomers().get();
        if(branch != null) {

            return true;
        }
        return false;
    }

    // add transactions for an existing branch customer
    // show list of customers for a branch
    // show transaction list for customers in a  branch
    // findBranch()
}
