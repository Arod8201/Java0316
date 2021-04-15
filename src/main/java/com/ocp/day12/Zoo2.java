package com.ocp.day12;

public class Zoo2 {
    
    public static void main(String[] args) {
        Cat cat = new Cat();
        playshout(cat);
        Tiger tiger = new Tiger();
        playshout(tiger);
        Cat cat2 = new Tiger();
        playshout(cat2);
    }
    
    public static void playshout(Cat x) {
        x.shout();
    }
}
