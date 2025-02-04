package com.ar.OOps;

public class BankMain {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("1234567", "Nkihil", 1000);


        System.out.println("Account Holder: "+ bankAccount.getaccountHolderName());
        System.out.println("Initial Balance: "+ bankAccount.getBalance());

        //Deposite

        bankAccount.deposite(1000);
        System.out.println("Current Balance: "+ bankAccount.getBalance());

        //WithDraw

        bankAccount.withDraw(1000);
        System.out.println("After WithDraw Balance: "+ bankAccount.getBalance());

    }
}
