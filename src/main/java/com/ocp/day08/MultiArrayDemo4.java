package com.ocp.day08;

public class MultiArrayDemo4 {

    public static void main(String[] args) {
        double[][] hw = {{170, 160, 180}, {60, 45, 90}};
        double[] h = hw[0];
        double[] w = hw[1];

        for (int i = 0; i < 3; i++) {
            double bmi = w[i] / Math.pow(h[i] / 100, 2);
            System.out.printf("%.2f\n", bmi);
        }
    }

}
