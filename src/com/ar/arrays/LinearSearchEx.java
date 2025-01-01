package com.ar.arrays;

public class LinearSearchEx {
    public static void main(String[] args) {


        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 12};
        int key = 12;

        int result = linearSearch(numbers, key);

        if (result >= 0){
            System.out.println("Element "+ key +" Found in index: "+ result);
        }else {
            System.out.println("The Search number is not found...");
        }
    }

    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
}
