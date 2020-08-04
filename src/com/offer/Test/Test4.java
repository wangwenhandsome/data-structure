package com.offer.Test;

import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/8/3 17:27
 * @Version: 1.0
 * @Description:
 */

public class Test4 {
    public static void main(String[] args) {
        int arr[]={8,9,1,7,2,3,5,4,6,0};
        shellSort2(arr);//交换方式
        System.out.println(Arrays.toString(arr));
    }
    public static void shellSort2(int [] arr){
       int temp;
       for (int gap=arr.length/2;gap>0;gap/=2){
           for (int i=gap;i<arr.length;i++){
               int j=i;
               temp=arr[i];
               while (j-gap>=0&&temp<arr[j-gap]){
                   arr[j]=arr[j-gap];
                   j-=gap;
               }
               if (j!=i){
                   arr[j]=temp;
               }

           }
       }

    }
}
