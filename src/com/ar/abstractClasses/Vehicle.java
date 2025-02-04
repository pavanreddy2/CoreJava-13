package com.ar.abstractClasses;

public abstract class Vehicle {

    //Instance Variable...
    protected String name;

    public Vehicle(String name){
        this.name = name;
    }

    public abstract void start();

    public void engine() {
        System.out.println("Engine.....");
    }
}
