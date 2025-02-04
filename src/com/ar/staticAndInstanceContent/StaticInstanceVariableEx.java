package com.ar.staticAndInstanceContent;

class A {
    int i = 10;
    static int j = 10;
}
public class StaticInstanceVariableEx {
    public static void main(String[] args) {

        A a1 = new A();
        System.out.println("i ->" + a1.i + "    "+ "j ->"+ a1.j);
        a1.i = a1.i + 1;
        a1.j = a1.j + 1;
        System.out.println("i ->" + a1.i + "    "+ "j ->"+ a1.j);
        System.out.println();
        A a2 = new A();
        System.out.println("i ->" + a2.i + "    "+ "j ->"+ a2.j);
        a2.i = a2.i + 1;
        a2.j = a2.j + 1;
        System.out.println("i ->" + a2.i + "    "+ "j ->"+ a2.j);

        System.out.println();
        A a3 = new A();
        System.out.println("i ->" + a3.i + "    "+ "j ->"+ a3.j);
        a3.i = a3.i + 1;
        a3.j = a3.j + 1;
        System.out.println("i ->" + a3.i + "    "+ "j ->"+ a3.j);

    }
}
