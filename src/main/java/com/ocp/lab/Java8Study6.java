package com.ocp.lab;

import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Java8Study6 {

    public static void main(String[] args) {
        String[] names = {"banana", "watermelon", "apple", "orange", "mango"};
        // 請求出所有字母的總和 ?
        int sum = Stream.of(names)
                //.mapToInt(s -> s.length())
                .mapToInt(String::length)
                .filter(s -> s % 2 == 0)
                .sum();
        System.out.println(sum);

    }
}
