package com.ar.java8;

@FunctionalInterface
interface MyInterface {

    public void m1();

    static void m2 () {}

    default void m3 () {}

}
public class Test1 {
    public static void main(String[] args) {

        MyInterface myInterface = () ->
            System.out.println("Executing m1 method");
        myInterface.m1();

    }
}
