package com.ar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        //Even Number

       Predicate<Integer> even =  n -> n % 2 == 0;

        List<Integer> list = new ArrayList<>();

        for (Integer n : numbers){
              if (even.test(n)){
                  list.add(n);
              }
          }
        System.out.println(list);

    }
}
