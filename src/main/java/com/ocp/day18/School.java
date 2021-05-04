package com.ocp.day18;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class School {

    public static void main(String[] args) {
        Arrays.stream(DataCenter.getPeople())
                .forEach(System.out::println);
        System.out.println("=========================");

        // 請問考試的總分與平均 = ?
        IntSummaryStatistics stat = Arrays.stream(DataCenter.getPeople())
                .filter(s -> s instanceof Student)
                //.peek(s -> System.out.println(s.getClass().getTypeName()));
                .map(s -> (Student) s)
                .mapToInt(s -> s.getScore())
                .summaryStatistics();
        System.out.println("學生的總分: " + stat.getSum());
        System.out.println("學生的總分平均: " + stat.getAverage());
        System.out.println("=========================");

        // 請問老師的薪資與平均 = ?
        IntSummaryStatistics stat1 = Arrays.stream(DataCenter.getPeople())
                .filter(s -> s instanceof Teacher)
                .map(s -> (Teacher) s)
                .mapToInt(s -> s.getSalary())
                .summaryStatistics();
        System.out.println("老師的薪資: " + stat1.getSum());
        System.out.println("老師的薪資平均: " + (int) stat1.getAverage());
        System.out.println("=========================");

        // 印出不及格的學生姓名與分數 , 老師姓名 , 不及格的總平均
        Consumer<Student> p = s -> System.out.printf("學生:%s, 分數:%d, 老師:%s\n", s.getName(), s.getScore(), s.getTeacher().getName());
        Predicate<Student> notpass = s -> s.getScore() < 60;

        double avg = Arrays.stream(DataCenter.getPeople())
                .filter(s -> s instanceof Student)
                //.peek(s -> System.out.println(s.getClass().getTypeName()));
                .map(s -> (Student) s)
                .filter(notpass)
                .peek(p)
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println("=========================");
        System.out.println("不及格平均: " + avg);
        System.out.println("=========================");
        
       // 老師不及格的學生比例佔百分之幾 ? 
    }
}
