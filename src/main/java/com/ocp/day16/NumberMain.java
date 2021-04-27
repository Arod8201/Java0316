package com.ocp.day16;

public class NumberMain {

    public static void main(String[] args) {
        // Lambda 實作 EvenNumber, n = 50 是否是偶數
        EvenNumber en = (n) -> n % 2 == 0;
        System.out.println(en.isEven(50));

        // Lambda 實作 PrimeNumber, n = 9973 是否是質數
                PrimeNumber pn = n -> {
            if (n == 1) {
                return false;
            }
            boolean ok = true;
            int nn = (int) (Math.sqrt(n));
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    ok = false;
                    break;
                }
            }
            return ok;
        };
        System.out.println("是否為質數: " + pn.isPrime(9973));
    }
}
