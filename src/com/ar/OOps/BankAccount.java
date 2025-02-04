package com.ar.OOps;

public class BankAccount {

    private String acoountNumber;

    private String accountHolderName;

    private double balance;


    public BankAccount(String acoountNumber, String accountHolderName, double balance) {
        this.acoountNumber = acoountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAcoountNumber() {
        return acoountNumber;
    }

    public String getaccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    //Method to Deposit money into the account

    public void deposite (double amount){
        if (amount > 0){
            balance += amount;

            System.out.println("Successfully Deposited: "+ amount);
        } else {
            System.out.println("Deposite amount must be positive");
        }
    }

    //Method to withDraw money

    public void withDraw(double amount){
        if (amount > 0){
            if (amount <= balance){
                balance = balance - amount;
                System.out.println("Successfully withdraw: "+ amount);
            } else {
                System.out.println("Insufficinet balance");
            }
        }
    }
}
