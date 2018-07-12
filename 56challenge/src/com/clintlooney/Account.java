package com.clintlooney;

public class Account {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    // Constructors
    // THe below calls a constructor from within a constructor to handle constructor calls with no parameters
    public Account() {
        // A special use of the this keyword you won't see elsewhere:
        this(00000,1000,"Default name","default address","5555555555");
        System.out.println("Empty constructor called.");
    }

    public Account(int accountNumber, double balance, String name, String email, String phone) {
        // Using the this keyword rather than calling a setter guarantees the field will be initialized. Problems can sometimes occur when calling the setter in a constructor.
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Account(String name, String email, String phone) {
        this(0000,100.55,name,email,phone); // Defaults the account number and balance, then called our major con
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double dAmount) {
        System.out.println("Existing balance: " + this.balance);
        System.out.println("Deposit amount: " + dAmount);

        this.balance += dAmount;
        System.out.println("New balance: " + this.balance + "\n");
    }

    public void withdraw(double wAmount) {
        if (this.balance < wAmount) {
            System.out.println("Existing balance: " + this.balance);
            System.out.println("Attempted withdrawal: " + wAmount);
            System.out.println("Withdrawal cancelled due to insufficient funds\n");
        } else {
            System.out.println("Previous balance: " + this.balance);
            System.out.println("Withdrawal amount: " + wAmount);
            this.balance -= wAmount;
            System.out.println("New balance: " + this.balance + "\n");
        }
    }
}