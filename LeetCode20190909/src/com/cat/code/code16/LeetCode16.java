package com.cat.code.code16;


import java.util.Arrays;

/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resNum = nums[0]+nums[1]+nums[2];
        for (int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;
            while (l<r){
                int nowNum = nums[i]+nums[l]+nums[r];
                if(Math.abs(nowNum-target)<Math.abs(resNum-target)){
                    resNum = nowNum;
                }
                if(nowNum>target){
                    r--;
                }
                if(nowNum<target){
                    l++;
                }
                if(nowNum==target){
                    return nowNum;
                }
            }
        }
        return resNum;
    }

    public static void main(String[] args){
        LeetCode16 leetCode = new LeetCode16();
        System.out.println(leetCode.threeSumClosest(new int[]{-1,2,1,-4},1));
    }
}
