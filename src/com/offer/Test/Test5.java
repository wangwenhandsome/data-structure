package com.offer.Test;

import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/8/3 18:10
 * @Version: 1.0
 * @Description:
 */

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {-9,78,0,23,-567,70, -1,900, 4561};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int [] arr,int left,int right){
       int l,r,t;
       l=left;
       r=right;
       if(l>r){
           return;
       }
       //临时性变量
        int temp=arr[l];
       while(l<r){
           while(l<r&&temp<=arr[r]){
               r--;
           }
           while(l<r&&temp>=arr[l]){
               l++;
           }
           if(l<r){
               t=arr[r];
               arr[r]=arr[l];
               arr[l]=t;
           }
       }
       arr[left]=arr[r];
        arr[r]=temp;
        quickSort(arr,left,r-1);
        quickSort(arr,r+1,right);

    }
}
