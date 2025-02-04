package com.ar.OOps.inheriatance;

public class Manager extends Employee{

    public Manager(String eId, String ename, float esalary){
        eid = eId;
        eName = ename;
        eSalary = esalary;
    }

    public void getManagerDetails () {
        System.out.println("Manager Details");
        employeeDetails();
    }
}
