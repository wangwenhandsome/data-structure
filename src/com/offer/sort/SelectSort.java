package com.offer.sort;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/7/25 8:43
 * @Version: 1.0
 * @Description:
 */

public class SelectSort {
    public static void main(String[] args) {
        int [] arr={5,4,-1,8,2,10,3};
        SelectSort(arr);
    }
    public static void SelectSort(int []arr){
        for (int i=0;i<arr.length-1;i++){
            int temp=0,k=0;
            for(int j=i;j<arr.length;j++){
                temp=arr[i];
               if(temp>arr[j]){
                 temp=arr[j];
                 k=j;
               }
            }
            arr[k]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }


}
