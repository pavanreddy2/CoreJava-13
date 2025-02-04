package com.ar.exception;

public class ArthimaticException extends Throwable {
    public static void main(String[] args) {

        int i = 100;

        int j = 0;

        int k = i /j;

        System.out.println(k);
    }
}
