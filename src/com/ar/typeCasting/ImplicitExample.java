package com.ar.typeCasting;

public class ImplicitExample {
    public static void main(String[] args) {


        int i = 100;
        char charValue = 'Z';

        double d = charValue; //implicit TypeCasting


        System.out.println("The value of charValue "+ charValue);
        System.out.println("The value of d "+ d);
    }
}
