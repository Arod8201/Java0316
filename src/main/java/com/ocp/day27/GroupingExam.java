package com.ocp.day27;

import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toSet;

public class GroupingExam {

    public static void main(String[] args) {
        List<Exam> exams = Arrays.asList(
                new Exam("John", 100),
                new Exam("Mary", 50),
                new Exam("Hellee", 70),
                new Exam("Tom", 80),
                new Exam("Bob", 30)
        );

        // 請問及格/不及格的人數分組
        // {true = 3, false = 2}
        System.out.println(
                exams.stream()
                        .collect(Collectors.groupingBy(e -> e.getScore() >= 60))
        );
        System.out.println("====================");

        System.out.println(
                exams.stream()
                        .collect(Collectors.groupingBy(e -> e.getScore() >= 60, Collectors.counting()))
        );
        System.out.println("====================");

        // {true= [John, Hellen, Tom ], false = [Mary, Bob]}
        System.out.println(
                exams.stream()
                        .collect(Collectors.groupingBy(e -> e.getScore() >= 60,
                                Collectors.mapping(Exam::getName, toSet())))
        );
        System.out.println("====================");

        System.out.println(
                exams.stream()
                        .collect(Collectors.groupingBy(e -> e.getScore() >= 60 ? "及格" : "不及格",
                                Collectors.mapping(Exam::getName, Collectors.toSet()))) // 直接 toSet() 也可以 , 不過要 import 
        );
        System.out.println("====================");

        // 如何把{不及格=[Bob, Mary], 及格=[Tom, John, Hellen]} 放入到 finalMap 中
        // 並印出 finalMap
        Map<String, Set<String>> finalMap = exams.stream()
                .collect(Collectors.groupingBy(e -> e.getScore() >= 60 ? "及格" : "不及格",
                        Collectors.mapping(Exam::getName, toSet())));
        System.out.println("finalMap: " + finalMap);

    }
}
