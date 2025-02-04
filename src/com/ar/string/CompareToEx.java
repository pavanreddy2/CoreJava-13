package com.ar.string;

public class CompareToEx {
    public static void main(String[] args) {

        String str1= "apple";
        String str2 = "banana";
        String str3 = "Apple";

        System.out.println(str1.compareTo(str2)); // Return  negative
        System.out.println(str2.compareTo(str1));
        System.out.println(str3.compareToIgnoreCase(str1));
    }
}
