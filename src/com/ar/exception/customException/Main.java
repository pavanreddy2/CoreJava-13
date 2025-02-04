package com.ar.exception.customException;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.00);

        //Deposite

        account.deposit(-50);
        System.out.println("Current Balance: "+ account.getBalance());

        //Withdrew
        try {
            account.withdraw(200);
        } catch (InsuffientFundsExcepion excepion){
            System.out.println("Caught: "+ excepion.getMessage());
        }
        //System.out.println("Current Balance: "+ account.getBalance());
    }
}
