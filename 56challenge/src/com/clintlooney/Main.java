package com.clintlooney;

public class Main {

    public static void main(String[] args) {
        Account clint = new Account(6301233, 11421, "Clint Looney", "clintlooney@gmail.com", "7196864078");
        Account lin = new Account();
        Account jenny = new Account("Janny","jenny@strangerfiction.com","7196864076");
        System.out.println(jenny.getName());
        System.out.println(lin.getAccountNumber());
        clint.deposit(7500);
        clint.withdraw(100);
        clint.withdraw(250.50);
        clint.withdraw(10000);
    }
}
