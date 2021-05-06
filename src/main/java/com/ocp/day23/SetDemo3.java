package com.ocp.day23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {

    public static void main(String[] args) {
        // 泛型 < > : 型別限定
        Set<Integer> scoers = new LinkedHashSet<>();
        scoers.add(100);
        scoers.add(90);
        scoers.add(80);
        //scoers.add(3.14);
        //scoers.add(true);
        System.out.println(scoers);
        System.out.println("=====================");

        Iterator<Integer> iter = scoers.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            Integer next = iter.next();
            sum += next;
        }
        System.out.println(sum);

        // Java 8
        // 1.   
        sum = scoers.stream()
                .mapToInt(scoer -> scoer.intValue())
                .sum();
        System.out.println(sum);

        // 2.   
        sum = scoers.stream()
                .mapToInt(scoer -> scoer)
                .sum();
        System.out.println(sum);

        // 3. 
        sum = scoers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
