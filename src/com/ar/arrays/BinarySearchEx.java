package com.ar.arrays;

import java.util.Arrays;

public class BinarySearchEx {
    public static void main(String[] args) {
                    // left 0              right 6
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        int searchKey = 22;

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


       int result =  binearySearch(numbers, searchKey);
        if (result >= 0){
            System.out.println("Element "+ searchKey +" Found in index: "+ result);
        }else {
            System.out.println("The Search number is not found...");
        }
    }

    private static int binearySearch(int[] numbers, int searchKey) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;  // 3

            if (numbers[mid] == searchKey){
                return mid;
            }
            if (numbers[mid] < searchKey) {
                left = mid + 1;
            } else {
               right = mid - 1;
            }
        }
        return -1;
    }

}
