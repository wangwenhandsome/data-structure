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
        boolean flag=false;
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag=true;
                }
                if (!flag) { // 在一趟排序中，一次交换都没有发生过
                    break;
                } else {
                    flag = false; // 重置flag!!!, 进行下次判断
                }
            }
            System.out.println("第" + (i + 1) + "趟排序后的数组");
            System.out.println(Arrays.toString(arr));
        }
    }
}
