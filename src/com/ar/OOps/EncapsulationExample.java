package com.ar.OOps;

public class EncapsulationExample {
    public static void main(String[] args) {

        Employee employee = new Employee(101, "Nikhil", 10000d);
/*
        employee.setId(101);
        employee.setName("Nikhil");
        employee.setSalary(10000d);*/


        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
