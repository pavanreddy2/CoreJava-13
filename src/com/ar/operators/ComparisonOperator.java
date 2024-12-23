package com.ar.operators;

public class ComparisonOperator {
    public static void main(String[] args) {

        int i = 100;
        int j = 10;
        int k = 1000;
        int x = 10;

        System.out.println(i == j);  // 100 == 10 --> false
        System.out.println(i == k);  // 100 == 1000 --> false
        System.out.println(j == x);  // 10 == 10 --> true


        System.out.println(i > j ); // 100 > 10 --> true

        System.out.println(i != k); // 100 != 1000 --> true

        System.out.println(i >= j); // true

        String str1 = "niki";

        String str2 = "niki";

        System.out.println(str1 == str2);
    }
}
