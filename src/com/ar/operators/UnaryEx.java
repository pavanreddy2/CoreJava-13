package com.ar.operators;

public class UnaryEx {
    public static void main(String[] args) {

        int a = 10;   // 11
        int b = ++a; // Pre increment //  11 ==> 12

        int c = b++;  // Post Increment // 11  // 10
        int d = c--;  // Post Decrement   // d - 11


        System.out.println("The value of a is :"+ a); // 11
        System.out.println("The value of b is :"+ b); // 12
        System.out.println("The value of c is :"+ c); // 10
        System.out.println("The value of d is :"+ d);  // 11
    }
}
