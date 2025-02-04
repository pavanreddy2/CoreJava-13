package com.ar.abstractClasses;

public class Test1 {
    public static void main(String[] args) {

        Vehicle bike = new Bike("Royal Enfield.");
        bike.start();
        bike.engine();

        System.out.println();

        Vehicle car = new Car("Nissan..");
        car.start();
        car.engine();

        System.out.println();
        Car car1 = new Car("Tata");
        car1.engine();
        car1.start();
    }
}
