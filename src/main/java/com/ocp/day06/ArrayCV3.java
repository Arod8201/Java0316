package com.ocp.day06;
// 調查五位學生之身高及體重如下，試比較其分散程度。
// 身高：172、168、164、170、176(公分)
// 體重：62、57、58、64、64(公斤)
// 請問身高及體重哪一個比較集中

public class ArrayCV3 {

    public static void main(String[] args) {
        double[] height = {172, 168, 164, 170, 176};
        double[] weight = {62, 57, 58, 64, 64};
        double h_cv = MyMath.cv(height);
        double w_cv = MyMath.cv(weight);
        String result = (h_cv < w_cv) ? "身高" : "體重";
        System.out.printf("身高cv: %.2f%% 體重cv: %.2f%% %s集中度較高", h_cv * 100, w_cv * 100, result);
//        System.out.println(MyMath.sd(weight));
//        System.out.println(MyMath.sd(height));
//        System.out.println(MyMath.cv(weight));
//        System.out.println(MyMath.cv(height));
    }
}
