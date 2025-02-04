package com.ar.abstractClasses;

public class Car extends Vehicle{
    public Car(String name) {
        super(name);    //call to the Constructor of the abstrat class.
    }

    @Override
    public void start() {
        System.out.println("Started Car");
    }
}
