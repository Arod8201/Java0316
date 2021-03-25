package com.ocp.day06;

// 某公司有18位員工，
//其中10位在去年投資股票，一年的獲利率如下(單位：%)：
//7.6 3.9 15.6 28.3 1.2 10.8 35.3 45.6 10.2 0.5
//另外8位員工投資買公債一年內獲利率如下(單位：%)
//6.8 7.2 6.8 7.5 6.9 7.9 7.9 7.1 7.2
//試分別求此公司的員工投資股票與公債的獲利率變異係數
//以及哪一種投資的獲利較穩健 ?
//求出股票最大獲利與最低獲利的獲利率如何?
public class ArrayCV4 {

    public static void main(String[] args) {
        double[] stocks = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
        double[] bonds = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
        double a_stocks = MyMath.cv(stocks);
        double b_bonds = MyMath.cv(bonds);
        String result = (a_stocks < b_bonds) ? "stocks" : "bonds";
        System.out.printf("stocks-CV: %.2f%% bonds-CV: %.2f%% %s獲利較穩健", a_stocks * 100, b_bonds * 100, result);
        System.out.println();

        double max = MyMath.max(stocks);
        System.out.println("股票最大獲利率: " + max);

        double min = MyMath.min(stocks);
        System.out.println("股票最低獲利率: " + min);

    }
}
