package com.ar.constructor;


class Employee1 {

    int empId;
    String empName;
    double empSalary;


    //0-arg constructor
    Employee1() {
    }

    // Parameterized constructor with one parameter
    Employee1 (int empId) {
        this.empId = empId;
    }

    // Parameterized constructor with two parameter
    Employee1 (int empId, String empName) {
        this.empId = empId;
        this.empName = empName;

    }

    // Parameterized constructor with three parameter
    Employee1 (int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;

    }

    @Override
    public String toString() {
        return "Employee1{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {

        Employee1 employee1 = new Employee1();

        Employee1 employee2 = new Employee1(101);

        Employee1 employee3 = new Employee1(101, "Niki");

        Employee1 employee4 = new Employee1(101, "Niki", 100000);


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
    }
}
