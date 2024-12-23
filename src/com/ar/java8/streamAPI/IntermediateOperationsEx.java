package com.ar.java8.streamAPI;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;


public class IntermediateOperationsEx {
    public static void main(String[] args) {

        //Stored the data in a list
        List<String> list = Arrays.asList("abbas", "naresh", "jagadeesh", "pavan","abbas");

        List<String> name = list.stream().filter(s -> s.startsWith("a")).distinct()
                .collect(Collectors.toList());

        System.out.println(name);

        list.stream().filter(s -> s.startsWith("a")).distinct().forEach(System.out::println);

        //map()
         List<String> names =  list.stream().map(String::toUpperCase).distinct().collect(Collectors.toList());
        System.out.println(names);

       List<String> sorted = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);
    }
}
