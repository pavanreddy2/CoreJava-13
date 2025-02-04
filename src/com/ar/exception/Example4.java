package com.ar.exception;

import java.util.Date;

public class Example4 {
    public static void main(String[] args) {
        try {
            int i = 100;
            int j = 10;
            int k = i / j;

            Date d = new Date();
            System.out.println(d.toString());

            int[] arr = {1, 2, 3, 45, 2};
            System.out.println(arr[111]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
