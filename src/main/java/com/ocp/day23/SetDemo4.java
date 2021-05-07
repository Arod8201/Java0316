package com.ocp.day23;

import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    
    public static void main(String[] args) {
               // 國英數的分數是介於 0~100
        Set<Integer> scores = new LinkedHashSet<>();
        scores.add(100);
        scores.add(200);
        scores.add(90);
        scores.add(-150);
        scores.add(80);
        System.out.println(scores);
        System.out.println("=================");

        // 請用 Java 8 計算國, 英, 數的總分
// 1.
        int sum = scores.stream()
                .mapToInt(Integer::intValue)
                .filter(s -> s >= 0 && s <= 100)
                .sum();
        System.out.println("1.Java 8 總分: " + sum);
        System.out.println("=================");

// 2.
        int sum1 = scores.stream()
                .mapToInt(Integer::intValue)
                .filter(Score::isValid)
                .sum();
        System.out.println("2.Java 8 總分: " + sum1);
        System.out.println("=================");

// 3.
        IntSummaryStatistics stat = scores.stream()
                .map(scoer -> (int) scoer)
                //.peek(s -> System.out.println(s.getClass().getTypeName()))
                .mapToInt(scoer -> scoer.intValue())
                .filter(scoer -> (scoer <= 100) && (scoer >= 0))
                .summaryStatistics();
        System.out.println("3.總分: " + stat.getSum());
        System.out.println("=================");
    }
}
