package com.ocp.day16;

public class BMICalc {

    // 利用 Lambda 實作 BMI 介面
    public static void main(String[] args) {
        BMI b = (h, w) -> w / Math.pow(h / 100, 2);
        System.out.println(b.getResult(170, 60));
    }
}
