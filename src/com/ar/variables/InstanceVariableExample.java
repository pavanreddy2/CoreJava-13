package com.ar.variables;

/**
 * Instance Variable: A variable which is declared inside the class and outside of the method.
 */
public class InstanceVariableExample {

    //Declared Instance Variable
    float f = 500f;
    public static void main(String[] args) {
        //Access the Instance variable -- Using new Keyword.
        InstanceVariableExample ref = new InstanceVariableExample();
        System.out.println("Access the Instance Variable: "+ ref.f);

    }
}
