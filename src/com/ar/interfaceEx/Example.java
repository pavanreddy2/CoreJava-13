package com.ar.interfaceEx;

public class Example {
    public static void main(String[] args) {

        I ref = new A();
        ref.m2();
        ref.m3();
        //ref.m4();

        System.out.println(ref.x);
        System.out.println(ref.name);


        A a = new A();
        a.m4();
    }
}
