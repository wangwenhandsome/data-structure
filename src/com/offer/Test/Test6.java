package com.offer.Test;

import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/8/4 10:47
 * @Version: 1.0
 * @Description:归并排序
 */

public class Test6 {
    public static void main(String[] args) {
        int arr[] = {8, -1, 4, -9, 10, 108, 3, 2, 7, 15, 45, -101};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));

    }

   public  static void mergeSort(int [] arr,int left,int right,int [] temp){
        if(left<right){
            int mid=(left+right)/2;
            //左递归
            mergeSort(arr,left,mid,temp);
            //右递归
            mergeSort(arr,mid+1,right,temp);
            merge(arr,left,mid,right,temp);
        }
   }
   public static void merge(int [] arr,int left,int mid,int right,int []temp){
        int i=left;
        int j=mid+1;
        int t=0;
        while (i<=mid&&j<=right){
            if (arr[i]<=arr[j]){
                temp[t]=arr[i];
                i++;
                t++;
            }else{
                temp[t]=arr[j];
                j++;
                t++;
            }
        }
        while (i<=mid){
            temp[t]=arr[i];
            i++;
            t++;
        }
        while (j<=right){
            temp[t]=arr[j];
            j++;
            t++;
        }

        int index=left;
        t=0;
        while (index<=right){
            arr[index]=temp[t];
            index++;
            t++;
        }
   }
}
