package com.ocp.day10;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain {

    public static void main (String[] args) {
        Person[] persons = {
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 60.5),
            new Person("Jo", 19, 155, 60.5),
            new Person("Hellen", 16, 185, 60.5),
            new Person("Ton", 21, 190, 60.5),};

        // 請印出未成年的人名 ?
        Stream.of(persons)
                .filter(p -> p.getAge() < 18)
                .forEach(p -> System.out.println(p.getName()));

        // 請印出 BMI 合格正常的人名 (18 < bmi <= 23) Part I
        Stream.of(persons)
                .filter(p -> {
                    double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
                    if (bmi > 18 && bmi <= 23) {
                        return true;
                    }
                    return false;
                })
                .forEach(p -> System.out.println(p.getName()));
        // 請印出 BMI 合格正常的人名 (18 < bmi <= 23) Part II
        // BMI 合格正常的過濾邏輯(filter)先拆出來
// 過濾正常範圍 BMI       
        Predicate<Person> nomalBmi = p -> {
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            if (bmi > 18 && bmi <= 23) {
                return true;
            }
            return false;
        };
// 過濾過瘦範圍 BMI        
        Predicate<Person> thinBmi = p -> {
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            if (bmi <= 18) {
                return true;
            }
            return false;
        };
// 過濾過胖範圍 BMI         
        Predicate<Person> fatBmi = p -> {
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            if (bmi > 23) {
                return true;
            }
            return false;
        };
// 印出過濾後的正常範圍 BMI 
        Stream.of(persons)
                .filter(nomalBmi)
                .forEach(p -> System.out.println(p.getName()));
    }
}
