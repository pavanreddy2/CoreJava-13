package com.ar.string;

public class ReplaceMethod {
    public static void main(String[] args) {

        String str = "ar institute";

       String replace =  str.replace("ar", "java");
        System.out.println(replace);

        //replaceFirst

        String str1 = "ar institute, ar";

        String s = str1.replaceFirst("ar", "java");
        System.out.println(s);
    }
}
