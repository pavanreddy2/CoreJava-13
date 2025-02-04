package com.ar.abstractClasses;

public abstract class Animal {
    //abstract Method (Does not have a body)
    public abstract void sound();

    //concrete method
    void eat() {
        System.out.println("This animal eats food..");
    }
}
