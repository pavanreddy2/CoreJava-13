package com.ar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("naresh", "abbas", "nilakanta");
        Consumer<String> printName =  System.out::println;

        for (String name: names){
            printName.accept(name);
        }
    }
}
