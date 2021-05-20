package com.ocp.day27;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(80);
        nums.add(90);
        System.out.println("最大值: " + Collections.max(nums));
        System.out.println("最小值: " + Collections.min(nums));
        System.out.println("====================");
        System.out.println(nums);
        System.out.println("====================");

        Collections.sort(nums); // 自然排序(小->大)
        System.out.println(nums);
        System.out.println("====================");

        Comparator<Integer> comparator = (o1, o2) -> o2 - o1;
        Collections.sort(nums, comparator);
        //Collections.sort(nums, (o1, o2) -> o2 - o1); // 也可以用此方式
        System.out.println(nums);
        System.out.println("====================");

        Collections.sort(nums); // 自然排序(小->大)
        Collections.reverse(nums); // 反轉由大到小
        System.out.println(nums);

    }

}
