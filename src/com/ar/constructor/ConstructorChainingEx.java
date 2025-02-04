package com.ar.constructor;

public class ConstructorChainingEx {
    public static void main(String[] args) {

        Manager manager = new Manager();
        System.out.println(manager);

        Manager manager2 = new Manager("John Doe", "Developer", 75000);
        System.out.println(manager2);
    }
}
