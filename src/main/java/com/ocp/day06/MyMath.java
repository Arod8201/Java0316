package com.ocp.day06;

public class MyMath {

// 求總和
    public static double sum(double[] nums) {
        int sum = 0;
        for (double n : nums) {
            sum += n;
        }
        return sum;
    }

// 求平均
    public static double avg(double[] nums) {
        double sum = sum(nums);
        double n = nums.length;
        double avg = sum / n;
        return avg;
    }

// 求標準差SD
    public static double sd(double[] nums) {
        double avg = avg(nums);
        double sumOfSquares = 0; // 求平方和
        for (double n : nums) {
            sumOfSquares += Math.pow(n - avg, 2);
        }
        int n = nums.length;
        double sd = Math.sqrt((1.0 / n) * sumOfSquares);
        return sd;
    }

// 求變異係數CV
    public static double cv(double[] nums) {
        double avg = avg(nums);
        double sd = sd(nums);
        double cv = sd / avg;
        return cv;
    }

// 求最大值    
    public static double max(double[] stocks) {
        double max = Double.MIN_VALUE; // 取 Double的 最小值
        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] > max) {
                max = stocks[i];
            }
        }
        return max;
    }

// 求最小值   
    public static double min(double[] stocks) {
        double min = Double.MAX_VALUE; // 取 Double的 最大值 
        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] < min) {
                min = stocks[i];
            }
        }
        return min;
    }
}
