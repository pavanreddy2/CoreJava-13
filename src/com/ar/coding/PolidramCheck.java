package com.ar.coding;

public class PolidramCheck {
    public static void main(String[] args) {
        String str = "racecara";

        boolean polidram = isPolidrame(str);
        if (polidram) {
            System.out.println("The given String poilidram: "+ polidram);
        } else {
            System.out.println("Is not polidram");
        }
    }

    private static boolean isPolidrame(String str){
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
