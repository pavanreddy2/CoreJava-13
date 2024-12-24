package com.ar.operators;

public class UnaryEx3 {
    public static void main(String[] args) {

        //declare variable
       // int a = 100;
        //int b = 1000;
        //int c = 10;

        int a = 100, b = 1000, c = 10;
        int result1, result2;

        result1 = a++;

        result2 = --b;
        System.out.println(result1); // 100
        System.out.println(result2); // 999
    }
}
