package com.offer.Test;

import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/8/3 17:22
 * @Version: 1.0
 * @Description:
 */

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};
        insertsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertsort(int [] arr) {
        for (int i=1;i<arr.length;i++){
            int insertVal=arr[i];
            int insertIndex=i-1;
            while(insertIndex>=0&&insertVal<arr[insertIndex]){
                arr[insertIndex+1]=arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex!=i){
                arr[insertIndex+1]=insertVal;
            }
        }
    }
}
