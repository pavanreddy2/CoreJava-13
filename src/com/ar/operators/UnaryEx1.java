package com.ar.operators;

public class UnaryEx1 {

    public static void main(String[] args) {
        int a = 100;   // 101 //  102
        int b = ++a;  // preincremet --> 101  -- 100
        int c = a++;  // Post increment -- 101

        int d = --b;    // 100 // 101
        int e = d++;   //100

        System.out.println("The value of a is :"+ a);
        System.out.println("The value of b is :"+ b);
        System.out.println("The value of c is :"+ c);
        System.out.println("The value of d is :"+ d);
        System.out.println("The value of e is :"+ e);
    }
}
