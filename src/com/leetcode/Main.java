package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/8/10 18:10
 * @Version: 1.0
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(9/2);
    }
    public int[][] findContinuousSequence(int target) {
        int i=1; //左
        int j=1; //右
        int sum=0;
        ArrayList<int []> arr=new ArrayList<int []>();
        while(i<=target/2){
            if(sum<target){
                sum+=j;
                j++;
            }else if(sum>target){
                sum-=i;
                i++;
            }else{
               int [] a=new int[j-i];
                for (int k = 0; k < j-i; k++) {
                    a[k]=j-i+k;
                }
               arr.add(a);
            }
        }
            return  arr.toArray(new int[arr.size()][]);
    }
}
