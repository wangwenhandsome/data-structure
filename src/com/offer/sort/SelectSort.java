package com.offer.sort;

import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/7/25 8:43
 * @Version: 1.0
 * @Description:
 */

public class SelectSort {
    public static void main(String[] args) {
        int [] arr={25,88,21,47,19,27,68,65,20};
        SelectSort(arr);
    }
    public static void SelectSort(int []arr){

       for(int i=0;i<arr.length-1;i++){
           int min = arr[i],k = i;
           for(int j=i+1;j<arr.length;j++){
               if(min>arr[j]){
                   min=arr[j];
                   k=j;
               }
           }
           if(k!=i){
               arr[k]=arr[i];
               arr[i]=min;
           }
           System.out.println("第" + (i + 1) + "趟排序后的数组");
           System.out.println(Arrays.toString(arr));
       }
        System.out.println(Arrays.toString(arr));
    }


}
