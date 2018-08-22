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
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName)); //~~TECHNIQUE: ADD ARRAYLIST ITEM ADD ARRAYLIST ELEMENT
            return true;
        }
        System.out.println("Branch already exists");
        return false;

    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer list for " + branchName + "branch: ");
            ArrayList<Customer> branchCustomers = // TODO

            for(int i = 0; i < ; i ++) {
                System.out.println();
            }
            return true;
        }

        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                System.out.println("Branch found: " + branchName);
                return checkedBranch;
            }
            System.out.println("Branch not found");
            return null;
        }
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        for(int i = 0; i < ; i++) {
            // TODO
        }
        return false;
    }
    // add customer to branch with initial transaction amount
    // add transactions for an existing branch customer
    // show list of customers for a branch
    // show transaction list for customers in a  branch
    // findBranch()
}
