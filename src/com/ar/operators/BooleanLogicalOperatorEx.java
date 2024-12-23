package com.ar.operators;

public class BooleanLogicalOperatorEx {
    public static void main(String[] args) {

        boolean a1 = true;
        boolean a2 = false;
        boolean a3 = true;
        boolean a4 = false;


        boolean flag =   a2 && a3;
        System.out.println(flag);
        System.out.println(a1 && a1); // true
        System.out.println(a2 && a3); // false
        System.out.println(a1 || a2); // true
        System.out.println(!a3);  // false

        System.out.println(a2 && a4); // false

        System.out.println("**************************");

        int age = 24;
        boolean isCitizen = true;

       boolean isEligible =  (age >= 18) && isCitizen;  // 24 >=18 - true && true --> true
        System.out.println(isEligible);
    }
}
