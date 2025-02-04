package com.ar.codingQuestions.arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1,3,4,5};

        int result =  missingNumber(arr, arr.length);

        System.out.println(result);
    }

    private static int missingNumber(int[] arr, int total) {
             int exp =    total * ((total + 1) / 2);

             int actual = 0;

             for (int i : arr) {
                 actual = actual + i;
             }

             return exp - actual;
    }
}
