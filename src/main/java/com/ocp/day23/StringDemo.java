package com.ocp.day23;

import java.util.*;

public class StringDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("J");
        stack.push("a");
        stack.push("v");
        stack.push("a");
        System.out.println(stack);

        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }
        System.out.println(str);
    }

}
