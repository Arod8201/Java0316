package com.ocp.day06;

import java.util.Arrays;

public class ArrayBMICV {
    
    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        double[] h = {172, 168, 164, 170, 176};
        double[] w = {62, 57, 58, 64, 64};
        Person[] persons = new Person[5]; // 先 new 5個空間
        System.out.println(persons[0]);
        
        for (int i = 0; i < persons.length; i++) {
            // 建立一個 Person 物件 P
            Person p = new Person(names[i], h[i], w[i]);
            // 將 Person 物件 p 放入到 persons[i]中
            persons[i] = p;
            // 將資料 p 印出
            System.out.println(persons[i]);
        }
        // 印出 BMI 值
        for (Person p : persons) {
            System.out.printf("bmi: %.1f\n", p.bmi);
        }
        // 建立一個 double[] bmis
        double[] bmis = new double[5];
        for (int i = 0; i < persons.length; i++) {
            bmis[i] = persons[i].bmi;
        }
        // 印出 bmis 的資料
        System.out.println(Arrays.toString(bmis));
        // 計算 bmi_cv
        double bmi_cv = MyMath.cv(bmis);
        System.out.printf("BMI CV: %.2f%%\n", bmi_cv * 100);
    }
}
