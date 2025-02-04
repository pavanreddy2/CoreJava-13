package com.ar.string;

public class ConcatEx {
    public static void main(String[] args) {

        String str1 = new String ("java");

        String str2 = str1.concat(" programming");

        String str3 = str2.concat(" language");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("**********************");
        StringBuffer sb = new StringBuffer("java");
       StringBuffer sb1 =  sb.append(" programming");
       StringBuffer sb2 = sb1.append(" language");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb2);
    }
}
