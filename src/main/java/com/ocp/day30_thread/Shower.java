package com.ocp.day30_thread;

class FatherThread extends Thread { // 爸爸執行緒

    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒瓦斯");
        System.out.println("爸爸打電話請瓦斯工人送瓦斯");
        WorkerThread worker = new WorkerThread();
        worker.start();

        try {
            worker.join(10_000); // 等 worker 做完之後再繼續做(可以給最大容忍值)
            //Thread.sleep(6000);
        } catch (Exception e) {
        }

        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
}

class WorkerThread extends Thread {  // 瓦斯工人執行緒

    @Override
    public void run() {
        System.out.println("瓦斯工人開始送瓦斯");
        for (int i = 1; i <= 5; i++) { // i<=5 或 i<= 30 模擬瓦斯工人送瓦斯的時間
            System.out.printf("%d 秒鐘\n", i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("發生意外: " + e);
            }
        }
        System.out.println("瓦斯工人將送瓦斯到府");
    }
}

public class Shower {

    public static void main(String[] args) {
        FatherThread ft = new FatherThread();
        ft.start();
    }
}
