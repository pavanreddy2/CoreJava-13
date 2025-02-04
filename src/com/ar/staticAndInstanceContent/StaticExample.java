package com.ar.staticAndInstanceContent;

public class StaticExample {

    //class -level and Instance Variable.
    int i = 100;

    static int j = 200;  //static Variable

    public static void main(String[] args) {

        StaticExample s = null;

        //System.out.println(s.j);

        System.out.println(s.i);
    }
}
