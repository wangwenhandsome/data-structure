package com.offer.sort;

import java.util.LinkedList;

/**
 * @Author: 王文
 * @Date: 2020/7/24 9:31
 * @Version: 1.0
 * @Description:
 */

public class Insertsort {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};
        insertsort(arr);

    }
    public static void insertsort(int [] arr){
        for (int i=1;i<=arr.length-1;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0&&arr[j]>temp){
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    j--;
            }

        }
    }
}
