package com.ar.exception;

class ExceptionEx {
    int m1() {
        try {
            return 10;//This line will execure first
        } catch (Exception ex) {
            return 20; // This line will not execute
        } finally {
            return 30; //This will always execute , overrring any previous retrun statements.
        }
    }
}
public class Example {
    public static void main(String[] args) {

        ExceptionEx ex = new ExceptionEx();
         int result = ex.m1();
        System.out.println(result);
    }
}
