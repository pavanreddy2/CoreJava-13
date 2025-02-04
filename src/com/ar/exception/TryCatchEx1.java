package com.ar.exception;

public class TryCatchEx1 {
    public static void main(String[] args) {
        System.out.println("before try ...");
        try {
            System.out.println("inside try..");
            int[] i = {12,3,4,5};
            System.out.println("Value of K "+ i[10]);
        } catch (Exception e) {
            System.out.println("inside Catch..." + e.getMessage());
        }}
}
