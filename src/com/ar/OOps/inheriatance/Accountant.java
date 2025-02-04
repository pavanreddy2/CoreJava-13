package com.ar.OOps.inheriatance;

public class Accountant extends Employee{

    public Accountant(String id, String name, float salary){
        eid = id;
        eName = name;
        eSalary = salary;
    }

    public void getAccountDetails () {
        System.out.println("Accountant Details");
        employeeDetails();
    }
}
