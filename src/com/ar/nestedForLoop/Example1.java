package com.ar.nestedForLoop;

public class Example1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++){
            for (int j = 1; j < 10; j ++){
                System.out.println("i :"+ i +"===>"+ "j :"+ j);
            }
        }
    }
}

// i = 0    ==> j == 1
//i =  0  ==> j = 2
// i 0 ==> j = 9

// i = 1 ==> j = 1