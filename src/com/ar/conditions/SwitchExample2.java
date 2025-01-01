package com.ar.conditions;

public class SwitchExample2 {
    public static void main(String[] args) {
        String fruit = "apples";

        int price;
        switch (fruit){
            case "apple":
                price = 100;
                break;
            case "banaana":
                price = 50;
                break;
            default:
                price = 0;
        }
        System.out.println("the price of fruit is :"+ price);
    }
}
