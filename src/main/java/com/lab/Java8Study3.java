package com.lab;

import java.util.stream.IntStream;

public class Java8Study3 {

    public static void main(String[] args) {
        int[] scores = {80, 50, 70, 90, 40};
        int sum = 0;
        // 請算出總分與平均?
        // Java 7
// 1.
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println(sum);
        System.out.println(sum / 5);
        System.out.println("===============");
// 2.       
        int sum1 = 0;
        for (int s : scores) {
            sum1 += s;
        }
        double avg1 = (double) sum1 / scores.length;
        System.out.println(sum1);
        System.out.println(avg1);
        System.out.println("===============");

        // Java 8
        int sum2 = IntStream.of(scores).sum();
        double avg2 = IntStream.of(scores).average().getAsDouble();
        double avg3 = (double) sum2 / scores.length;
        System.out.println(sum2);
        System.out.println(avg2);
        System.out.println(avg3);
    }
}
