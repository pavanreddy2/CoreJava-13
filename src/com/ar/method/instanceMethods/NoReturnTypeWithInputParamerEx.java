package com.ar.method.instanceMethods;

public class NoReturnTypeWithInputParamerEx {


    public void add(int i, int j){
        int sum = i + j;
        System.out.println("The Sum of i And j :"+ sum);
    }

    public void log (String level, String message){
        System.out.println(level + "   "+ message);
    }

    public void m3 (String str, int i, float f, char c){
        System.out.println(str + " " + i + "  " + f + " "+ c);
    }
    public static void main(String[] args) {

        //Object create
        NoReturnTypeWithInputParamerEx ref = new NoReturnTypeWithInputParamerEx();

        ref.add(10, 20);

        ref.log("Info", "Error");
    }
}
