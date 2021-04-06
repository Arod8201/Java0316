package com.ocp.lab;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Study {

    public static void main(String[] args) {
        int[] scores = {80, 50, 70, 90, 40};
        // 請印出所有成績?
        // Java 7 寫法
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for (int s : scores) {
            System.out.println(s);
        }
        // Java 8 (利用 Stream.of() 來進行資料分析)
        IntStream.of(scores).forEach(s -> System.out.println(s));
        IntStream.of(scores).forEach(System.out::println);
    }
}
