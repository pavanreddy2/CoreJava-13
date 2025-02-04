package com.ar.exception.customException;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    //Deposite

    public void deposit (double amount){
        if (amount > 0) {
            balance += amount; // balance = balance + amount
            System.out.println("Deposited: "+ amount);
        } else {
            System.out.println("Deposite amount must be positive...");
        }
    }
    //Withdraw
    public void withdraw (double amount) throws InsuffientFundsExcepion{
        if (amount > balance) {
            throw new InsuffientFundsExcepion("Insufficient funds for withDraw. Current balance: "+ getBalance());
        } else {
            balance -= amount;
            System.out.println("withDrew: "+ amount);
        }
    }
    public double getBalance () {
        return balance;
    }
}
