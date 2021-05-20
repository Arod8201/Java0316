package com.ocp.day27;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map map1 = new Hashtable(); // HashMap(); TreeMap(); *(重要) LinkedHashMap();
        map1.put("B", 100);
        map1.put("C", 80);
        map1.put("E", 80);
        map1.put("D", 80);
        map1.put("A", 90);
        System.out.println(map1);

    }
}
