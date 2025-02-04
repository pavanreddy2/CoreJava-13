package com.ar.exception;


class ExceptionEx1 {
    int m1() {
        try {
           int i = 100;
           int j = 0;
           int k = i /j;
           return 10;
        } catch (Exception ex) {
            return 20;
        } finally {
            return 30;
        }
    }
}
public class Example1 {
    public static void main(String[] args) {
        ExceptionEx1 ex = new ExceptionEx1();
        int result = ex.m1();
        System.out.println(result);
    }
}
