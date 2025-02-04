package com.ar.exception;

class Employee {
    //static block
    static {
        System.out.println("Employee Class Loading.....");
    }

}
public class ClassNotFoundEx {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("com.ar.exception.Employee");
    }
}
