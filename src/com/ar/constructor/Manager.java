package com.ar.constructor;

public class Manager {

    private String name;
    private String role;
    private double salary;


    //Deafult consturctor
    Manager () {

        this("Unknown", "Unknown", 0);
    }

    //Parameterized consturctor
    public Manager(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
/*
    //Method
    public void display () {
        System.out.println("Name :"+ name + " Role :"+ role + "salary :"+ salary);

    }*/

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
