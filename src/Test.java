import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: 王文
 * @Date: 2020/9/22 19:14
 * @Version: 1.0
 * @Description:
 */
public interface Test {
    public static int search(int[] nums, int target) {
    //todo 实现算法
        int left=0;
        int right=nums.length-1;
        if(right==-1) return -1;
        while (left<right){
            int mid=(left+right)/2;
            if(nums[left]<nums[mid]){
                if(nums[left]<=target&&target<=nums[mid]){
                    right=mid;
                }else{
                    left=mid+1;
                }
            }else if(nums[left]>nums[mid]){
                if(nums[left]<=target||target<=nums[mid]){
                    right=mid;
                }else{
                    left=mid+1;
                }
            }else if(nums[left]==nums[mid]){
                if(nums[left]!=target){
                    left++;
                }
                else{
                    right=left;
                }
            }
        }
        return (nums[left]==target)?left:-1;
    }
}
