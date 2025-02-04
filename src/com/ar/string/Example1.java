package com.ar.string;

public class Example1 {
    public static void main(String[] args) {

        String str = new String("nikil");  // heap
        String str1 = new String("Nikil");

        String str3 = "nikil";

        String str4 = "nikil";

        System.out.println(str.equals(str1)); // false
        System.out.println(str3.equals(str1)); // false

        System.out.println(str == str4); // false
        System.out.println(str1.equals(str4)); // false
    }
}
