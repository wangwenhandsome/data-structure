package com.offer.sort;

import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/8/3 17:01
 * @Version: 1.0
 * @Description:
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-9,78,0,23,-567,70, -1,900, 4561};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        int l, r, temp, t;
        if (left > right) {
            return;
        }
        l = left;
        r = right;
        //temp就是基准位
        temp = arr[l];
        while (l < r) {
            //先看右边，依次往左递减
            while (temp <= arr[r] && r > l) {
                r--;
            }
            //先看左边，依次往右递增
            while (temp >= arr[l] && r > l) {
                l++;
            }
            //如果满足条件就交换
            if (l < r) {
                t = arr[r];
                arr[r] = arr[l];
                arr[l] = t;
            }
        }
        //最后将基准为与l和r相等位置的数字交换
        arr[left] = arr[l];
        arr[l] = temp;
        //递归调用左半数组
        quickSort(arr, left, r - 1);
        //递归调用右半数组
        quickSort(arr, r + 1, right);
    }
}
