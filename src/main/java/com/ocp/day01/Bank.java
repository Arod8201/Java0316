package com.ocp.day01;

public class Bank {

    public static void main(String[] args) {

        Account a01 = new Account(); // 建立第一個帳戶
        Account a02 = new Account(); // 建立第二個帳戶
        Account a03 = new Account(); // 建立第三個帳戶

        ///// 各帳戶第一次的存款
        a01.deposit(1000);
        a02.deposit(2000);
        a03.deposit(3000);
        System.out.printf("a01 帳戶餘額: $%,d\n", a01.getBalance());
        System.out.printf("a02 帳戶餘額: $%,d\n", a02.getBalance());
        System.out.printf("a03 帳戶餘額: $%,d\n", a03.getBalance());

        ///// 存款
        System.out.println("存款後---> ");
        a01.deposit(500);
        System.out.printf("a01 帳戶餘額: $%,d\n", a01.getBalance());
        a02.deposit(1000);
        System.out.printf("a02 帳戶餘額: $%,d\n", a02.getBalance());
        a03.deposit(1500);
        System.out.printf("a03 帳戶餘額: $%,d\n", a03.getBalance());

        ///// 提款
        System.out.println("a02 提款 800 後---> ");
        a02.withdraw(800);
        System.out.printf("a02 帳戶餘額: $%,d\n", a02.getBalance());

        ///// 存款
        System.out.println("a03 存款 -1200元後---> ");
        a03.deposit(-1200);
        System.out.printf("a03 帳戶餘額: $%,d\n", a03.getBalance());

        ///// 提款
        System.out.println("a03 提款 -1200元後---> ");
        a03.deposit(-1200);
        System.out.printf("a03 帳戶餘額: $%,d\n", a03.getBalance());
    }
}
