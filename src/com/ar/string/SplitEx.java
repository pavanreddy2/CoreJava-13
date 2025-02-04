package com.ar.string;

import java.util.Arrays;

public class SplitEx {
    public static void main(String[] args) {

        String text = "apple, orange,banana";
        String[] fruits = text.split(",");
        System.out.println(Arrays.toString(fruits));

        //With Limit paramter
        String data = "one:two:three:four";
        String[] parts = data.split(":", 3);
        System.out.println(Arrays.toString(parts));

        String course = "java, python, dataScience, SQL";
        String[] courses = course.split(",");

        for (String c : courses){
            System.out.println(c);
        }
    }
}
