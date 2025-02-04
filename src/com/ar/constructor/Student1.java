package com.ar.constructor;

public class Student1 {

    Student1 () {
        //Calling constructor2
        this(5);
        System.out.println("Default constructor");
    }

    Student1 (int x){
       //Calling constructor 3
        this(100,12);
        System.out.println(x);
    }



    Student1(int x, int y){
        System.out.println(x * y);
    }

    public static void main(String[] args) {
        Student1 student1 = new Student1();
    }
}
