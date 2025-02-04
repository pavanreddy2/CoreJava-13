package com.ar.string;

public class EqualsIgnoreEx {
    public static void main(String[] args) {

        String str1 = "nikhil";
        String str2 = new String("Nikhil");

        String str3 = "pavan";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // false
    }
}
