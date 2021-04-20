package com.ocp.day13;

public class Dog extends Pet implements Animal {

    @Override
    public void move() {
        System.out.println("跑");
    }

}
