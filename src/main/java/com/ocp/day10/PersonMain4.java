package com.ocp.day10;

import java.util.DoubleSummaryStatistics;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class PersonMain4 {

    public static void main(String[] args) {
        Person[][] persons = {
            { // A 班
                new Person("John", 17, 170, 60.5),
                new Person("Mary", 18, 160, 50.5)
            },
            { // B 班
                new Person("Jo", 19, 155, 42.5),
                new Person("Hellen", 16, 185, 75.5),
                new Person("Ton", 21, 190, 120.5)
            },};
        // 請印出所有人的 bmi 資料
        // 取得 bmi Part I
        // Function<Person, Double> getBMI = p -> p.getWeight() / Math.pow(p.getHeight() / 100, 2);
        // 取得 bmi Part II
        Function<Person, Double> getBMI = p -> {
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            return Math.round(bmi * 100) / 100.0;
        };
        Stream.of(persons)
                .flatMap(p -> Stream.of(p))
                .mapToDouble(getBMI::apply)
                .forEach(System.out::println);
        // 請問哪一個人 bmi 最大?
        // 解法 1.
        Consumer<Person> pritname = p -> System.out.println(p.getName());
        DoubleSummaryStatistics stat = Stream.of(persons)
                .flatMap(p -> Stream.of(p))
                .mapToDouble(getBMI::apply)
                .summaryStatistics();
        System.out.println("最大值: " + stat.getMax());

        // 解法 2.
        double maxBmi = Stream.of(persons)
                .flatMap(p -> Stream.of(p))
                .mapToDouble(getBMI::apply)
                .summaryStatistics()
                .getMax();

        Consumer<Person> printPerson = p -> {
            System.out.printf("%s %d %.1fcm %.1fkg bmi: %.2f\n",
                    p.getName(), p.getHeight(), p.getWeight(), getBMI.apply(p));
        };
        Stream.of(persons)
                .flatMap(p -> Stream.of(p))
                .filter(p -> getBMI.apply(p) == maxBmi)
                .forEach(printPerson);
    }
}
