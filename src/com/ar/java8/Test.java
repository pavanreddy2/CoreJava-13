package com.ar.java8;

interface Scalar {

    int operation(int a, int b); // Abstract Method


}

/**
 * No return
 */
public class Test {
    public static void main(String[] args) {

        Scalar addition = (a,b) -> a + b; {
            System.out.println("addition :"+ addition.operation(10,12));
        }
    }
}

