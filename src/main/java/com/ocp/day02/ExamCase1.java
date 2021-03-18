package com.ocp.day02;

public class ExamCase1 {

    public static void main(String[] args) {
        Exam a1 = new Exam("小明", 90, 80);
        Exam a2 = new Exam("小英", 60, 70);

        System.out.println(a1.getPrintData());
        System.out.println(a2.getPrintData());
    }
}
