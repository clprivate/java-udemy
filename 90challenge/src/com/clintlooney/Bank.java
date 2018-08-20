package com.clintlooney;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchList = new ArrayList<Branch>();

    public Bank(String bankname) {
        this.bankName = bankname;
    }
}
