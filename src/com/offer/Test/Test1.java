package com.offer.Test;

import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/8/3 14:21
 * @Version: 1.0
 * @Description:
 */

public class Test1 {
    public static void main(String[] args) {
        int [] a={5,4,-1,8,2,10,3};
        bubblesort(a);
    }
    public static void bubblesort(int [] arr){
        boolean flag=false;
        int temp;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }else{
                flag=false;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
