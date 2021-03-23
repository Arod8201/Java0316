package com.ocp.day04;

import com.ocp.day04.bar.Money;
import com.ocp.day04.AccessMoney.*;

public class AccessMoney {

    public static void main(String[] args) {
        Money a1 = new Money();
        System.out.println(a1.amount);

        // 打上完整路徑
        com.ocp.day04.foo.Money a2 = new com.ocp.day04.foo.Money();
        System.out.println(a2.amount);

        System.out.println(a1.amount + a2.amount);
    }
}
