package com.ocp.day20;

public class PenEqualsDemo {

    public static void main(String[] args) {
        Pen p1 = new Pen("Red", 100);
        Pen p2 = new Pen("Blue", 100);
        Pen p3 = new Pen("Blue", 100);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        //System.out.println(p1 == p2);
        System.out.println("================");
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println("================");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

    }
}
