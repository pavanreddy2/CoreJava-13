package com.ar.exception;

public class Example3 {
    public static void main(String[] args) {
            try {
                System.out.println("Try block will be execute....");
                System.exit(0);
            } catch (Exception e) {
                System.out.println("Catch will be execute....");
            } finally {
                System.out.println("Finally will be execute....");
            }
    }
}
