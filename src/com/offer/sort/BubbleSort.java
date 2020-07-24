package com.offer.sort;

import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/7/24 18:49
 * @Version: 1.0
 * @Description:冒泡排序
 */

public class BubbleSort {
    public static void main(String[] args) {
        int [] a={5,4,-1,8,2,10,3};
        bubblesort(a);
    }
    public static void bubblesort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "趟排序后的数组");
            System.out.println(Arrays.toString(arr));
        }

    }
}
