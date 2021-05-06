package com.ocp.day23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetDemo2 {

    public static void main(String[] args) {
        // 國英數的分數是介面 0~100
        Set scoers = new LinkedHashSet();
        scoers.add(100);
        //scoers.add(2000);
        scoers.add(90);
        scoers.add(80);
        scoers.add(3.14);
        scoers.add(true);
        System.out.println(scoers);
        System.out.println("=====================");

        // 過濾資料
        Iterator iter = scoers.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();

            if (next instanceof Double || next instanceof Boolean) {
                iter.remove();
            }

        }
        System.out.println(scoers);

        // 求總分
        int sum = 0;
        iter = scoers.iterator(); // 要重新取得走訪器
        while (iter.hasNext()) {
            Object next = iter.next();

            if (next instanceof Integer) {
                sum += (Integer) next;
            }
        }
        System.out.println(sum);
    }
}
