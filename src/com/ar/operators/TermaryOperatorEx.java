package com.ar.operators;

public class TermaryOperatorEx {
    public static void main(String[] args) {

        int a = 100;
        int b  = 5;

        int result = (a < b) ? a : b;
        System.out.println(result);

        System.out.println("***********************");

        int x = 10;

        String result1 = (x % 2 == 0) ? "Even" : "odd";
        System.out.println(result1);

        System.out.println("***********************");

        int age = 18;
        String result2 = (age > 18) ? "Eligible for vote" : "Not eligible for vote";
        System.out.println(result2);
    }
}
