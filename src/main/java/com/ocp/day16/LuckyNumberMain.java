package com.ocp.day16;

import java.util.Random;

public class LuckyNumberMain {

    public static void main(String[] args) {
        // 利用 Lambda 實作一個可以得到 1~9 的功能
        //LuckyNumber ln = r -> Math.random();
        LuckyNumber ln =()-> 5;

        // 利用 Lambda 實作一個可以得到 1~9 的功能
        LuckyNumber ln1 =()-> {
            
            Random r=new Random();
            int n =r.nextInt(49)+1;
        return 5;      
        };
    }
}
