package com.ar.variables;

/**
 * Static variable: A variable which is declared by using the static keyword is called static variable.
 */
public class StaticVariableExample {

    // declared static Variable
    static double d = 1000d;

    static char ch = 'a';

    public static void main(String[] args) {

        //accessing the Static Variable
        System.out.println(StaticVariableExample.d);
        System.out.println("The value of static variable is :" + StaticVariableExample.d);

        System.out.println(StaticVariableExample.ch);


        //Accessing the static variable using new Keyword.
        // ClassName refName = new ClassName();
        StaticVariableExample ref = new StaticVariableExample();
        System.out.println("Accessing the static variable using new Kewyord: " + ref.ch);
        System.out.println("Accessing the static variable using new Kewyord: " + ref.d);

    }
}
