package com.ar.java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

      Supplier<Double> supplier =  Math::random;

        System.out.println(supplier.get());
        System.out.println(supplier.get());

    }
}
