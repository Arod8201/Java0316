package com.ocp.day26;

import java.util.*;

public class MapDemo3 {

    public static void main(String[] args) {
        Map<Integer, String> students = new TreeMap<>();
        students.put(3, "Mary");
        students.put(1, "John");
        students.put(2, "Hellen");
        System.out.println(students);

    }
}
