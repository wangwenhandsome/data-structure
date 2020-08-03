package com.offer.sort;

import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/8/3 15:33
 * @Version: 1.0
 * @Description:
 */

public class ShellSort {
    public static void main(String[] args) {
        int arr[]={8,9,1,7,2,3,5,4,6,0};
        shellSort2(arr);//交换方式
    }
    public static void shellSort1(int [] arr){
        int temp;
        int count=0;
        for (int gap=arr.length/2;gap>0;gap/=2){
            for (int i=gap;i<arr.length;i++){
                for (int j=i-gap;j>=0;j-=gap){
                    if (arr[j]>arr[j+gap]){
                        temp=arr[j];
                        arr[j]=arr[j+gap];
                        arr[j+gap]=temp;
                    }
                }
            }
            System.out.println("希尔排序第" + (++count) + "轮 =" + Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
    //对交换式的希尔排序进行优化->移位法
    public static void shellSort2(int[] arr) {
       for (int gap=arr.length/2;gap>0;gap/=2){
           for (int i=gap;i<arr.length;i++){
               int temp=arr[i];
               int j=i;
               while(j-gap>=0&&temp<arr[j-gap]){
                   arr[j]=arr[j-gap];
                   j-=gap;
               }
               if(j!=i){
                   arr[j]=temp;
               }
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
