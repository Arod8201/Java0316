package com.ocp.day23;

import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    
    public static void main(String[] args) {
        Set<Integer> scoers = new LinkedHashSet<>();
        scoers.add(100);
        scoers.add(200);
        scoers.add(90);
        scoers.add(-150);
        scoers.add(80);
        System.out.println(scoers);

        // 請用 Java 8 計算國, 英, 數的總分
       // 1.
        IntSummaryStatistics stat = scoers.stream()
                .map(scoer -> (int) scoer)
                .mapToInt(scoer -> scoer.intValue())
                .filter(scoer -> (scoer > 100) && (scoer < 0))
                .summaryStatistics();
        System.out.println("總分: " + stat.getSum());
        
        // 2.
        int sum = scoers.stream()
                 .filter(Score::isValid)
               // .map(scoer -> (int) scoer)
                .mapToInt(Integer::intValue)              
                .sum();
        System.out.println("總分: " + sum);
    }
}
