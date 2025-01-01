package com.ar.conditions;

public class SwitchExample1 {
    public static void main(String[] args) {

         Day today = Day.THURSDAY;

        switch (today){
            case SUNDAY:
                System.out.println("Its a weekend");
                break;
            default:
                System.out.println("its weekday");
        }
    }
}
