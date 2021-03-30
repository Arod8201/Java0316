package com.ocp.day07;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("吃蒲萄吐葡萄");
        System.out.println(sb);
        System.out.println("================");
        // 吃葡萄不吐葡萄皮
        sb.append("皮");
        System.out.println(sb);
        System.out.println("================");
        sb.insert(3, "不");
        System.out.println(sb);
        System.out.println("================");
        sb.replace(1, 2, "葡"); // 1 開始找到小於 2 的資料
        System.out.println(sb);
        System.out.println("================");
        // 吐葡萄皮
        sb.delete(0, 4);
        System.out.println(sb);
        System.out.println("================");
        sb.delete(3, sb.length()); //sb.length()是 4
        System.out.println(sb);
    }
}
