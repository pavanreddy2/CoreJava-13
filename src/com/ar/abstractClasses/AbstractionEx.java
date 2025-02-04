package com.ar.abstractClasses;

public class AbstractionEx {
    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.sound();
        dog.eat();

        System.out.println();

        Animal cat = new Cat();
        cat.eat();
        cat.sound();

        Dog d = new Dog();
        d.walk();
    }
}
