package com.ocp.day23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetDemo2 {

    public static void main(String[] args) {
        // 國英數的分數是介於 0~100
        Set scores = new LinkedHashSet();
        scores.add(100);
        scores.add(2000);
        scores.add(90);
        scores.add(80);
        scores.add(3.14);
        scores.add(true);
        System.out.println(scores);
        System.out.println("=====================");

        // 過濾資料
        Iterator iter = scores.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            if (next instanceof Integer) {
                int score = (Integer) next;
                if (!(score >= 0 && score <= 100)) {
                    iter.remove();
                }
            } else {
                iter.remove();
            }
        }
        System.out.println("介於 0~100 過濾後: " + scores);
        System.out.println("=====================");

        // 求總分
        //System.out.println(iter);
        int sum = 0;
        iter = scores.iterator(); // 要重新取得走訪器
//        System.out.println(scores);
//        System.out.println(iter.getClass().getTypeName());
        while (iter.hasNext()) {
            Object next = iter.next();
            if (next instanceof Integer) {
                //System.out.println(next.getClass().getTypeName());
                sum += (Integer) next;
            }
        }
        System.out.println("總分: " + sum);
    }
}
