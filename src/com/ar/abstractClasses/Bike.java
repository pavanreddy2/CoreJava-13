package com.ar.abstractClasses;

public class Bike extends Vehicle{

    public Bike(String name) {
        super(name); //call to the Constructor of the abstrat class.
    }

    @Override
    public void start() {
        System.out.println("Bike started....");
    }
}
