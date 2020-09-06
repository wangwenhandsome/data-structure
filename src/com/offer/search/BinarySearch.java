package com.offer.search;

/**
 * @Author: 王文
 * @Date: 2020/9/6 21:41
 * @Version: 1.0
 * @Description:
 */

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 10, 89,1000,1000, 1234 };
        int resIndex = binarySearch(arr, 0, arr.length - 1, 1000);
        System.out.println("resIndex=" + resIndex);
    }
    public static int binarySearch(int [] arr,int left,int right,int findVal){
        int mid=(left+right)/2;
        int midVal=arr[mid];
        if (left>right) return -1;
        if (findVal>arr[mid]){
            return binarySearch(arr,mid+1,right,findVal);
        }else if(findVal<arr[mid]){
            return binarySearch(arr,left,mid-1,findVal);
        }else{
            return arr[mid];
        }
    }
}
