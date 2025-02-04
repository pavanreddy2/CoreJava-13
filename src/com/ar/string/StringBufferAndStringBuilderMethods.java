package com.ar.string;

import java.util.regex.Pattern;


public class StringBufferAndStringBuilderMethods {
    public static void main(String[] args) {

        //String : 2 ways 1) StringLiteral and new keyword

        ///StringBufferAndStringBuilder ==> only using new keyword.
        StringBuffer sb = new StringBuffer("At ");
        int i =  sb.length();
        System.out.println(i);

        //reverse
       // StringBuffer reverse = sb.reverse();
        //System.out.println(reverse);

        //Insert

        StringBuffer insert = sb.insert(1, " techlogoies");
        System.out.println(insert);

        //delete

       StringBuffer delete =  sb.delete(1,4);
        System.out.println(delete);

        StringBuffer c = sb.deleteCharAt(10);
        System.out.println(c);

        //replace

        StringBuffer replace = sb.replace(0, 3, "Nikhil");
        System.out.println(replace);

    }
}
