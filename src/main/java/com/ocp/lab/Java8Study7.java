package com.ocp.lab;

import java.util.stream.Stream;

public class Java8Study7 {

    public static void main(String[] args) {
        String[][] names = {{"Jo", "Mary"}, {"John", "Allen"}, {"Bob"}};
        // 求所有字母總和 ?
        int sum = Stream.of(names)
                .flatMap(s -> Stream.of(s)) // String[] 轉串流(Stream)
                .mapToInt(s -> s.length())
                .sum();
        System.out.println(sum);
    }
}
