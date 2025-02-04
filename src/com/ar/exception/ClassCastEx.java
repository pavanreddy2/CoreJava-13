package com.ar.exception;

class A {

}

class B extends A {

}
public class ClassCastEx {
    public static void main(String[] args) {

 /*       A a = new A();

        B b = (B) a;*/

        B b1 = new B();
        A a1 = b1;
    }
}
