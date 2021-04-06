package com.ocp.lab;

import java.util.stream.IntStream;

public class Java8Study2 {

    public static void main(String[] args) {
        int[] scores = {80, 50, 70, 90, 40};
        int sum = 0;
        // 列印及格的分數
        // Java 7
        for (int s : scores) { // for/each
            if (s >= 60) { // 過濾條件 filter
                System.out.println(s);
            }
        }
        // Java 8
        IntStream.of(scores)
                .filter(s -> s >= 60)
                .forEach(s -> System.out.println(s));
    }
}
