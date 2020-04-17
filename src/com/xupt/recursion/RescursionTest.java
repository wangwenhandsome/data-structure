package com.xupt.recursion;

/**
 * @Author: 王文
 * @Date: 2020/4/17 11:30
 * @Version: 1.0
 * @Description:
 */

public class RescursionTest {
    public static void main(String[] args) {
        //通过打印问题，回顾递归调用机制
        test(4);

        //int res = factorial(3);
        //System.out.println("res=" + res);
    }
    //打印问题.
    public static void test(int n) {
        if (n > 2) {
            test(n - 1);
        } //else {
        System.out.println("n=" + n);
        // }
    }
    //阶乘问题
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n; // 1 * 2 * 3
        }
    }

}
