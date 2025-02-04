package com.ar.OOps.inheriatance;

public class Main {
    public static void main(String[] args) {


        Manager manager = new Manager("101","Naveen", 10000f);

        manager.getManagerDetails();

        //Accountant
        System.out.println();
        Accountant accountant = new Accountant("102", "Nikhil", 50000);
        accountant.getAccountDetails();

    }
}
