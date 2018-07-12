package com.clintlooney;

import org.omg.CORBA.portable.ValueInputStream;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    // Getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    // Constructors
    public VipCustomer() {
        this("Default name", 00.00,"Default email");
    }

    public VipCustomer(String name, String email) {
        this(name, 00.00, email);
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}



