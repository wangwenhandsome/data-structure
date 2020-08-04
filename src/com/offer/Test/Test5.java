package com.offer.Test;

import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/8/3 18:10
 * @Version: 1.0
 * @Description:快速排序
 */

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {-9,78,0,23,-567,70, -1,900, 4561};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
   public static void quickSort(int [] arr,int left,int right){
        if(left>right){
            return;
        }
        int l=left,t;
        int r=right;
        int temp=arr[l];
        while (l<r){
           while (l<r&&arr[r]>=temp){
               r--;
           }
           while (l<r&&arr[l]<=temp){
               l++;
           }
           if(l<r){
               t=arr[r];
               arr[r]=arr[l];
               arr[l]=t;
           }
        }
        arr[left]=arr[l];
        arr[l]=temp;

        quickSort(arr,left,r-1);
        quickSort(arr,r+1,right);
   }
}
