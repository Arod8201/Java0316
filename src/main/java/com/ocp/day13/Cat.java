package com.ocp.day13;

public class Cat extends Pet implements Animal {

    @Override
    public void move() {
        System.out.println("跳");
    }

}
