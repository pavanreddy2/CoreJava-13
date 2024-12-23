package com.ar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FuntionInterfaceEx {
    public static void main(String[] args) {
        Function<Integer, Integer> sqaure = x -> x * x;

        int result = sqaure.apply(5);
        System.out.println(result);

        System.out.println("*******************");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println(numbers);
        Function<Integer,Integer> sqaureFunction = x -> x * x;

        List<Integer> list = new ArrayList<>();

        for (Integer num : numbers){
            list.add(sqaureFunction.apply(num));
        }
        System.out.println(list);
    }
}
