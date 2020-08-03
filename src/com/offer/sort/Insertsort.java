package com.offer.sort;

import java.util.Arrays;
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
    public static void insertsort(int [] arr) {
       for(int i=1;i<arr.length;i++){
           int insertVal=arr[i];
           int insertIndex=i-1;
           while(insertIndex>=0&&insertVal<arr[insertIndex]){
              arr[insertIndex+1]=arr[insertIndex];
              insertIndex--;
           }
           arr[insertIndex+1]=insertVal;
       }
        System.out.println(Arrays.toString(arr));
    }
}
