package com.ocp.day21;

public class USCurrencyDemo {

    public static void main(String[] args) {
        // 1, 5, 10 ,25
        //USCurrency us = new USCurrency(13);
        USCurrency us = USCurrency.PENNY;
        USCurrency us1 = USCurrency.NICKLE;
        USCurrency us2 = USCurrency.QUARTER;
        System.out.println(us.getValue());
        System.out.println(us1.getValue());

    }
}
