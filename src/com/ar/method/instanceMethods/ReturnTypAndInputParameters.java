package com.ar.method.instanceMethods;

public class ReturnTypAndInputParameters {

    static String str = "Pavan";
    public static int m1 (int i, int j){

        return i + j;
    }
    public static void main(String[] args) {

        int i = m1(100,100);
        System.out.println(i);

        System.out.println(str);
    }
}
