package com.ocp.day16;

public class AreaCalc2 {

    public static void main(String[] args) {

        // 利用 Lambda 語法實作
        CircleArea ca2 = (double r) -> Math.pow(r, 2) * Math.PI;
        CircleArea ca3 = r -> Math.pow(r, 3) * Math.PI;

        System.out.println(ca2.getArea(15));
        System.out.println(ca3.getArea(15));

        
    }
}
