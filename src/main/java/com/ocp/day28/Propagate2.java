package com.ocp.day28;

public class Propagate2 {

    public static void main(String[] args) {

        String s = "";
        try {
            System.out.println(reverse(s));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("已完成");
        }
    }

    public static String reverse(String s) throws Exception {
        if (s == null || s.length() == 0) {
            Exception e = new Exception("字串不可為空");
            throw e;
        }

        String reverseStr = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            reverseStr += s.charAt(i);
        }
        return reverseStr;
    }
}
