package com.ar.IterativeStatement;

public class ForLoopEx5 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 10; i = i + 1){
            count = count + i;
        }
        System.out.println(count + " ");
    }
}

//  0 + 1 = 1
// count = 1;
//  1 + 2 --> 3
// count = 3
//  3 + 3 = 6;   6 + 4 = 10 ;   10 + 5 - 15;  15 + 6 ==> 21; 21 + 7 = 28; 28 + 8 = 36; 36 + 9 = 45;  45 + 10 ==55
