package com.ocp.day16;

public class CicleAreaImpl2 implements CircleArea {

    @Override
    public double getArea(double r) {
        return 4 / 3 * r * r * r * Math.PI;
    }

}
