package com.ar.OOps.polymorphism;

class Math {

    void add (int a, int b){
        System.out.println("addition over integer values :"+ (a + b));
    }

    void add (float f1, float f2){
        System.out.println("addition over float values :"+ (f1 + f2));
    }

    void add (String s1, String s2){
        System.out.println("Concantination over Strings :"+ (s1 + s2));
    }
    void add (int a, float b, double c){
        System.out.println("addition over integer values :"+ (a + b + c));
    }
}
public class MethodOverloadingEx {
    public static void main(String[] args) {

        Math math = new Math();

        math.add(10,20);
        math.add(100f, 200f);
        math.add("Nikihil", "Kumar");
    }
}
