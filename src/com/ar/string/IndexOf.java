package com.ar.string;

public class IndexOf {
    public static void main(String[] args) {

        //String literal
        String str = "ar Instiitute, ar";

        int i = str.indexOf("I");
        System.out.println(i);

        //lastIndexOf

        int last =  str.lastIndexOf("a");
        System.out.println(last);
    }
}
