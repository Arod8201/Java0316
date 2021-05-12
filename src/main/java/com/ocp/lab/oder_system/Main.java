package com.ocp.lab.oder_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Food> order = new ArrayList<>();
    private static Datacenter dc = new Datacenter();
    private static ServiceCenter sc = new ServiceCenter();
    private static boolean play = true;

    public static void main(String[] args) throws Exception {
        while (play) {
            menu();
            //Runtime.getRuntime().exec("cls");
        }
    }

    public static void menu() {
        sc.menu();
         System.out.print("請輸入: ");
        Scanner scanner = new Scanner(System.in);
        int itemId = scanner.nextInt();
        switch (itemId) {
            case 1: // 檢視 Catalog
                sc.printCatalog();
                break;
            case 2: // 新增訂單餐點
                System.out.print("請輸入No: ");
                int addNo = scanner.nextInt();
                Food food = sc.getFoodByNo(addNo);
                order.add(food);
                // 在 oreder 集合中加入 Food
                //order.add(sc.getFoodByNo(addNo));
                break;
            case 3: // 查詢訂單餐點
                for (int i = 0; i < order.size(); i++) {
                    System.out.printf("id: %d %s\n", i, order.get(i));
                }
                break;
            case 4: // 取消訂單餐點
                System.out.print("請輸入取消Id: ");
                int cancelId = scanner.nextInt();
                order.remove(cancelId); // 移除單筆元素
                break;
            case 5: // 刪除訂單餐點
                order = new ArrayList<>();
                break;
            case 6: // 結帳
                int sum = order.stream()
                        .mapToInt(Food::getPrice)
                        .sum();
                System.out.printf("結帳總共: %d\n", sum);
                play = false;
                //order =new ArrayList<>();
                break;
            case 0: // 離開
                play = false;
        }
    }
}
