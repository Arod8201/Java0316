package com.ocp.day12;

public class Zoo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        Tiger tiger = new Tiger();
        tiger.shout();
        tiger.hunter();
        //cat.hunter(); // 因為 Cat 裡面沒有 hunter()

        // 多型宣告
        Cat cat2 = new Tiger();
        //cat2.hunter(); // 因為 Cat 裡面沒有 hunter()
        cat2.shout();

    }
}
