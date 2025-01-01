package com.ar.arrays;


public class Example1 {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "orange", "pineapple"};

        System.out.println(fruits.length);

        //Need to read the elements or values.
        // for loop
        // for Each
        //Iterator

        // for loop
/*
         for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }*/

         //For Each
 /*
        for (dataType ref: ArrayName){
            System.out.println(ref);
        }*/

        for (String ref: fruits){
            System.out.println(ref);
        }

        int[] scores = {95, 88, 75, 92, 83};

        for (int re: scores){
            System.out.println(re);
        }

    }
}
