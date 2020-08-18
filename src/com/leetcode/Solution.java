package com.leetcode;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: 王文
 * @Date: 2020/8/13 9:11
 * @Version: 1.0
 * @Description:
 */

public class Solution {
    /**
     * 将矩阵的二维数组进行上下翻转处理
     * @param matrix int整型二维数组 矩阵
     * @return int整型二维数组
     */
    public static int[][] convert (int[][] matrix) {
        if (matrix.length==0||matrix.length==1)
            return matrix;
        ArrayList<int []> arrayList=new ArrayList();
        for (int i=0;i<matrix.length;i++){
            arrayList.add(matrix[i]);
        }
        int [] [] arr=new int[matrix.length][];
        for (int i = arrayList.size()-1; i >=0; i--) {
            arr[i]=arrayList.get(i);
//            System.out.println(Arrays.toString(arrayList.get(i)));
        }
        return arr;
        // write code here
    }

    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int [][] a=convert(arr);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

    }
}