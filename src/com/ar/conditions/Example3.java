package com.ar.conditions;

public class Example3 {
    public static void main(String[] args) {
        double total_marks = 282;

        char grade;

        double perc = (total_marks / 500) * 100;

        if (perc >= 80){
            grade = 'A';
        } else if ((perc >= 70) && (perc < 80)){ // false && true ==> false
            grade = 'B';
        } else if ((perc >= 60) && (perc < 70)) { // false && true ==> false
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("The Percentage of Studnet is :"+ perc);
        System.out.println("The Grade of student is :"+ grade);
    }
}
