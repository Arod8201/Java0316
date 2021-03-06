package com.ocp.day36_io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadNews {

    public static void main(String[] args) {
        String newspath = "src\\main\\java\\com\\ocp\\day36_io\\files\\news.txt";
        try (FileInputStream fis = new FileInputStream(newspath);
                // byte[] 轉 char [] 可以支援指定編碼
                InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                BufferedReader br = new BufferedReader(isr);) {

            String data = null;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception e) {
        }
    }
}

//try (FileReader fr = new FileReader(newspath);
//                BufferedReader br = new BufferedReader(fr);) 
