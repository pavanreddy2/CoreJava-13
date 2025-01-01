package com.ar.method.instanceMethods;

public class NoReturnNoInputExample {

    /**
     * Instance Method or Non-Static Method
     * Method with No Input Parameters and No return Type.
     */
    public void m1() {

        int i = 100;
        System.out.println("This is a Variable :"+ i);
        System.out.println("This is a M1 Method.....");
    }


    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {

        //Calling Instance Method By Creating the Object...

        NoReturnNoInputExample ref1 = new NoReturnNoInputExample();
        ref1.m1();

    }
}
