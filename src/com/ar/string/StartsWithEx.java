package com.ar.string;

public class StartsWithEx {
    public static void main(String[] args) {

        String str1 = "ar institute";

       boolean result =  str1.startsWith("software");
        System.out.println(result);

        boolean result1 =  str1.startsWith("ar");
        System.out.println(result1);

        boolean result3 = str1.endsWith("institute"); //true
        System.out.println(result3);
    }
}
