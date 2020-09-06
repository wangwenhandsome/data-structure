package com.leetcode;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: 王文
 * @Date: 2020/8/13 9:11
 * @Version: 1.0
 * @Description:
 */

public class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            Arrays.sort(arr);
            int [] a=new int[k];
            for (int i=0;i<k-1;i++){
                a[i]=arr[i];
            }
            return a;
        }
}
