package com.xupt.sort;

import java.util.Arrays;

/**
 * @Author: 王文
 * @Date: 2020/4/19 9:51
 * @Version: 1.0
 * @Description:
 */

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};
        insertSort(arr);
    }
    //插入排序
    public  static void insertSort(int[] arr){

        //使用for循环来把代码简化
        for (int i=1;i<arr.length;i++){
            //定义待插入的数
            int insertVal=arr[i];
            int insertIndex=i-1;//即arr[1]的前面这个数的下标
            // 给insertVal 找到插入的位置
            //说明
            //1. insertIndex >= 0 保证在给insertVal 找插入位置，不越界
            //2. insertVal < arr[insertIndex] 待插入的数，还没有找到插入位置
            //3. 就需要将 arr[insertIndex] 后移
            while (insertIndex>=0&&insertVal<arr[insertIndex]){
                arr[insertIndex+1]=arr[insertIndex];// arr[insertIndex]
                insertIndex--;
            }
            //当退出while循环时，说明插入的位置找到, insertIndex + 1
            //举例：理解不了，我们一会 debug
            arr[insertIndex + 1] = insertVal;

            System.out.println("第"+i+"轮插入");
            System.out.println(Arrays.toString(arr));
        }



        //使用逐步推导的方式来讲解，便利理解
        //第1轮 {101, 34, 119, 1};  => {34, 101, 119, 1}
/*
        //定义待插入的数
        int insertVal=arr[1];
        int insertIndex=1-1;//即arr[1]的前面这个数的下标

        //给insertVal 找到插入的位置
        //说明
        //1. insertIndex >= 0 保证在给insertVal 找插入位置，不越界
        //2. insertVal < arr[insertIndex] 待插入的数，还没有找到插入位置
        //3. 就需要将 arr[insertIndex] 后移
        while (insertIndex>=0&&insertVal<arr[insertIndex]){
            arr[insertIndex+1]=arr[insertIndex];// arr[insertIndex]
            insertIndex--;
        }
        //当退出while循环时，说明插入的位置找到, insertIndex + 1
        //举例：理解不了，我们一会 debug
        arr[insertIndex + 1] = insertVal;

        System.out.println("第1轮插入");
        System.out.println(Arrays.toString(arr));



        //第2轮 {101, 34, 119, 1};  => {34, 101, 119, 1}

        //定义待插入的数
        insertVal=arr[2];
        insertIndex=2-1;//即arr[1]的前面这个数的下标

        //给insertVal 找到插入的位置
        //说明
        //1. insertIndex >= 0 保证在给insertVal 找插入位置，不越界
        //2. insertVal < arr[insertIndex] 待插入的数，还没有找到插入位置
        //3. 就需要将 arr[insertIndex] 后移
        while (insertIndex>=0&&insertVal<arr[insertIndex]){
            arr[insertIndex+1]=arr[insertIndex];// arr[insertIndex]
            insertIndex--;
        }
        //当退出while循环时，说明插入的位置找到, insertIndex + 1
        //举例：理解不了，我们一会 debug
        arr[insertIndex + 1] = insertVal;

        System.out.println("第2轮插入");
        System.out.println(Arrays.toString(arr));


        //第2轮 {101, 34, 119, 1};  => {34, 101, 119, 1}

        //定义待插入的数
        insertVal=arr[3];
        insertIndex=3-1;//即arr[1]的前面这个数的下标

        //给insertVal 找到插入的位置
        //说明
        //1. insertIndex >= 0 保证在给insertVal 找插入位置，不越界
        //2. insertVal < arr[insertIndex] 待插入的数，还没有找到插入位置
        //3. 就需要将 arr[insertIndex] 后移
        while (insertIndex>=0&&insertVal<arr[insertIndex]){
            arr[insertIndex+1]=arr[insertIndex];// arr[insertIndex]
            insertIndex--;
        }
        //当退出while循环时，说明插入的位置找到, insertIndex + 1
        //举例：理解不了，我们一会 debug
        arr[insertIndex + 1] = insertVal;

        System.out.println("第3轮插入");
        System.out.println(Arrays.toString(arr));

 */
    }
}
