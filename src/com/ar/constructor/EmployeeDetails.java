package com.ar.constructor;

public class EmployeeDetails {
    public static void main(String[] args) {

        Employee employee = new Employee(101, "Nikhil", 50000.00);

        System.out.println(employee);

        Employee employee1 = new Employee(102, "Sravani", 45000.00);
        System.out.println(employee1);
    }
}
