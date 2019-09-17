package com.cat.code.code11;


/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode11 {
    public int maxArea(int[] height) {
        int left = 0,right=height.length-1,maxArea=0;
        while (left<right){
            int nowArea = Math.min(height[left],height[right])*(right-left);
            maxArea=Math.max(maxArea,nowArea);
            if(height[left]<=height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args){
        LeetCode11 leetCode = new LeetCode11();
        System.out.println(leetCode.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(leetCode.maxArea(new int[]{1,8}));
    }
}
