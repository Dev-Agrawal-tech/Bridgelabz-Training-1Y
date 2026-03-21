package com.gla.classes_objects.Constructors_Level1;

public class BanckAccount {

	public String accountNumber;     
    protected String accountHolder;  
    private double balance;         
    void BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public double getBalance() {
        return balance;
    }

}
