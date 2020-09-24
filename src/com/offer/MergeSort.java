package com.offer;

/**
 * @Author: 王文
 * @Date: 2020/9/21 11:07
 * @Version: 1.0
 * @Description:
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {11,44,23,67,88,65,34,48,9,12};
        int[] tmp = new int[arr.length];    //新建一个临时数组存放
        mergesort(arr,0,arr.length-1,tmp);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
   public static void mergesort(int []arr,int left,int right,int [] temp){
        if (left<right){
            int mid=(left+right)>>1;
            mergesort(arr,left,mid,temp);
            mergesort(arr,mid+1,right,temp);
            //合并
            merge(arr, left, mid, right, temp);
        }
   }
   public static void merge(int []arr,int left,int mid,int right,int[] temp) {
        int i=left;
        int j=mid+1;
        int t=0;
        while (i<=mid&&j<=right){
            if (arr[i]<=arr[j]){
                temp[t++]=arr[i++];
            }else{
                temp[t++]=arr[j++];
            }
        }
        while (i<=mid){
            temp[t++]=arr[i++];
        }
        while (j<=right){
            temp[t++]=arr[j++];
        }
        t=0;
        int templeft=left;
        while (templeft<=right){
            arr[templeft++]=temp[t++];
        }
   }
}
