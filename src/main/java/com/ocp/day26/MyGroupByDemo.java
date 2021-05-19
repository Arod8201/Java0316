package com.ocp.day26;

// 資料分組
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyGroupByDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("apple");
        names.add("banana");
        names.add("apple");
        names.add("apple");
        names.add("orange");
        names.add("papaya");
        names.add("banana");
        // apple=3 , banana=2 , orange=1 , papaya=1

        // *分組* (很重要) 
        System.out.println(
                names.stream()
                        //.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .collect(Collectors.groupingBy(name -> name, Collectors.counting()))
        );

        System.out.println(
                names.stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        );
        //{papaya=1, orange=1, banana=2, apple=3} = Map<String, Long> 

        Map<String, Long> result = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);

    }

}
