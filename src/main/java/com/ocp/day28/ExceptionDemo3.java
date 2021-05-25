package com.ocp.day28;

public class ExceptionDemo3 {

    public static void main(String[] args) {
        int[] nums = {10, 5}; // {10, 0} {10} null
        try {
            int avg = nums[0] / nums[1];
            // ArithmeticException (數學錯誤)
            // ArrayIndexOutOfBoundsException (陣列個數不足)
            // NullPointerException (陣列沒有給實體 給null)
            System.out.println(avg);
        } catch (ArithmeticException e) {
            System.out.println("數學錯誤, 錯誤原因: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("陣列維度(個數)不足, 錯誤原因: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("陣列沒有實體建立, 錯誤原因: " + e.getMessage());
        }

    }

}
