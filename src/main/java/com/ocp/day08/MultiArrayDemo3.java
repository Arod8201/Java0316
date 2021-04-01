package com.ocp.day08;

public class MultiArrayDemo3 {

    public static void main(String[] args) {
        // 3人的身高與體重如下
        double[][] hw = {{170, 60}, {160, 45}, {180, 90}};
        // 求三人的 bmi
        for (double[] x : hw) {
            double h = x[0];
            double w = x[1];
            double bmi = w / Math.pow(h / 100, 2);
            System.out.printf("%.2f\n", bmi);
        }

//        double bmi;
//        double[] bmis = new double[5];
//        for (int i = 0; i < hw.length; i++) {
//            for (int j = 0; j < hw[i].length; j++) {
//                bmi = hw[j] / Math.pow(hw[i] / 100, 2);
//            }
//        }
//        System.out.println("");
    }
}
