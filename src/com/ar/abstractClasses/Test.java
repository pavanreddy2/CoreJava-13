package com.ar.abstractClasses;

public class Test {
    public static void main(String[] args) {

        A ref = new B();

        ref.m1();
        ref.m2();
        ref.m3();
       // ref.m4(); //
        ref.m5();

        System.out.println();
        //Case2

        B ref1 = new B();
        ref1.m1();
        ref1.m2();
        ref1.m3();
        ref1.m4();
        ref1.m5();
    }
}
