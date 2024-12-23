package com.ar.operators;

public class AssignmentOperatorEx {
    public static void main(String[] args) {

        int i = 100;

        System.out.println("The value of i: "+i);

        int j = 10;
        System.out.println("The value of j before substration: "+ j);
        j -= 10;  // j = j - 10; --> 0

        System.out.println("The value of j after substration: "+ j);

        int a1 = 100;
        System.out.println("The value of j before multiplication: "+ j);
        a1 *= 2;  // a1 = a1 * 2 --> 100 * 2 - 200
        System.out.println("The value of j after multiplication: "+ a1);
    }
}
