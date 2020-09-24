package com.offer;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @Author: 王文
 * @Date: 2020/9/21 10:36
 * @Version: 1.0
 * @Description:
 */

public class quickSort {
    public static void main(String[] args){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"--");
        }
    }

   public static void quickSort(int arr[],int low,int high){
        int i,j,t,temp;
        if (low>high) return;
        temp=arr[low];
        i=low;
        j=high;
        while (i<j){
            while (i<j&&temp<=arr[j]){
                j--;
            }
            while (i<j&&temp>=arr[i]){
                i++;
            }
            if (i<j){
                t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }
        arr[low]=arr[i];
        arr[i]=temp;
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,high);
   }
}
