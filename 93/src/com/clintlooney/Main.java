package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;

        anotherCustomer = customer;
        customer.setBalance(12.18);


    }
}
