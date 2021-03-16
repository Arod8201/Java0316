package com.ocp.day01;

public class Account {

    private int balance; //帳戶餘額

    int getBalance() {
        return balance; /////方法停止並回傳餘額
    }
///// 自行撰寫查詢帳戶餘額的方法

    void withdraw(int money) { //提款方法

        ///// 驗證 money 是否符合條件 ///// 驗證 money 是否大於 blance
        if (money > balance || money <= 0) {
            System.out.println("---提款金額不符---");
            return; ///// 提款方法到此結束
        }
        balance -= money;
    }
///// 提款方法

    void deposit(int money) { //存款方法

        ///// 驗證 money 是否符合條件
        if (money <= 0) {
            System.out.println("---存款金額不符---");
            return; ///// 存款方法到此結束
        }
        balance += money;
    }
///// 存款方法
}
