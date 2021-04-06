package com.ocp.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;
import sun.awt.image.IntegerComponentRaster;

public class Java8Study5 {

    public static void main(String[] args) {
        // 請算出及格成績的總和
        // Java 7
        String[] scores = {"80", "50", "70", "90", "40"};
        int num = 0, sum = 0;
        for (int i = 0; i < scores.length; i++) {
            String.valueOf(scores[i]);

            System.out.println(scores[i]);
            System.out.println("=============");
        }
        // Java 8
        IntSummaryStatistics stat = Stream.of(scores)
                .mapToInt(s -> Integer.parseInt(s)) // 得到IntStream // map -> 轉換
                .filter(s -> s >= 60) // 過濾及格分數
                .summaryStatistics(); // 統計物件

        System.out.printf("sum: %d, max: %d, min: %d\n", stat.getSum(), stat.getMax(), stat.getMin());
    }
}
