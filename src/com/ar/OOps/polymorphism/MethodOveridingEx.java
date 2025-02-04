package com.ar.OOps.polymorphism;

public class MethodOveridingEx {
    public static void main(String[] args) {

  /*      //Case 1: method overriding is not happend
        A a = new A();
        a.m1();*/


        //case2:Method overrinding is happen. is not correct of calling.
    /*    B b = new B ();
        b.m1();*/

        //Case 3:

        A a = new B();
        a.m1();
    }

}
