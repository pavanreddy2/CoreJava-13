package com.ar.exception;

import java.util.Date;

public class NullPointerEx extends Throwable {
    int i = 100;
    public static void main(String[] args) {

        NullPointerEx ref = null;
        //System.out.println(ref.i);

        Date date = null;
        System.out.println(date.toString());
    }
}
