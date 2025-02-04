package com.ar.abstractClasses;

public class Dog extends Animal {

    //implemnting the abstract method
    @Override
    public void sound() {
        System.out.println("Dog barks...");
    }


    public void walk () {
        System.out.println("Walking....");
    }
}
