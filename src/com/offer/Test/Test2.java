package com.offer.Test;

import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/8/3 14:26
 * @Version: 1.0
 * @Description:
 */

public class Test2 {
    public static void main(String[] args) {
        int [] arr={5,4,-1,8,2,10,3};
        SelectSort(arr);
    }
    public static void SelectSort(int [] arr){
      for (int i=0;i<arr.length-1;i++){
          int min=arr[i];
          int index=i;
          for (int j=i+1;j<arr.length;j++){
              if(arr[j]<min){
                  min=arr[j];
                  index=j;
              }
          }
          if(index!=i){
              arr[index]=arr[i];
              arr[i]=min;
          }
      }
        System.out.println(Arrays.toString(arr));
    }
}
