package com.ar.OOps.polymorphism;

public class MethodOverridingEx1 {
    public static void main(String[] args) {

        Loan gold = new GoldLoan();
        System.out.println("Gold Loan:"+ gold.getIR());


        Loan study = new StudyLoan();
        System.out.println("Study Loan:"+ study.getIR());
    }
}
