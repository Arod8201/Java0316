package com.ocp.day16;

public class AreaCalc {

    public static void main(String[] args) {
        double r = 15.0;
        CircleArea ca = new CicleAreaImpl();
        System.out.println(ca.getArea(r));

        //匿名類部類別(球圓面積)
        CircleArea ca2 = new CircleArea() {
            @Override
            public double getArea(double r) {
                return r * r * Math.PI;
            }
        };
        System.out.println(ca2.getArea(r));

        //匿名類部類別(體積)
        CircleArea ca3 = new CircleArea() {
            @Override
            public double getArea(double r) {
                return 4 / 3 * r * r * r * Math.PI;
            }
        };
        System.out.println("C3體積: " + ca3.getArea(r));

        // Lambda
        //CircleArea ca4 = new CircleArea(r -> System.out.println(ca2.getArea(r)));
       
    }
}
