package com.ocp.day07;

public class StringEquals {

    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
// 必考
        String s3 = "Java"; // littal 宣告 (執行緒池)
        String s4 = "Java";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
