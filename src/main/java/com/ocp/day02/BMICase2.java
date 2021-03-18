package com.ocp.day02;

public class BMICase2 {

    public static void main(String[] args) {
        BMI b1 = new BMI();
        b1.name = "小明";
        b1.height = 178;
        b1.weight = 68;

        BMI b2 = new BMI();
        b2.name = "小英";
        b2.height = 168;
        b2.weight = 58;

        b1.print();
        b2.print();
    }
}
