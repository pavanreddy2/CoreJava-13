package com.ar.operators;

public class PostDecrementEx {
    public static void main(String[] args) {

        int a = 10;
        int b = a--; // Post Decrement  a = a - 1;


        System.out.println("The value of a is :"+ a); // 9
        System.out.println("The value of b is :"+ b);  //10
    }
}
