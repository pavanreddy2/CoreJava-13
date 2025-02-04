package com.ar.OOps.polymorphism;

 class Parent {
     Parent () {
         System.out.println("Constructor of Parent");

     }

 }

 class Child extends Parent {
     Child () {
         System.out.println("Constructor of Child");
     }

}
public class Rule2 {
    public static void main(String[] args) {

        Child obj = new Child();
    }
}
