package com.clintlooney;

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
        if branch(!= null) {
            
        }
    }

    private Branch findBranch(String branchName) {
            // TODO
        for (int i = 0; i < branches.size(); i++) {
            // TODO
        }
    }
    // findBranch()
    // add customer t5o branch with initial transaction amount
    // add transactions for an existing branch customer
    // show list of customers for a branch
    // show transaction list for customers in a  branch
    // findBranch()
}
