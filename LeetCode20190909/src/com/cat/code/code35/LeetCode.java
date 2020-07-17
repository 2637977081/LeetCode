package com.cat.code.code35;


public class LeetCode {

    public int searchInsert(int[] nums, int target) {
        if(nums.length<1||target<nums[0]){
            return 0;
        }
        int l=0,r=nums.length;
        if(nums[r-1]<target){
            return r;
        }
        while (l<r){
            int index = (l+r)/2;
            int mid = nums[index];
            if(mid==target){
                return index;
            }else if(r==l+1){
                return r;
            }else if(mid<target){
                l=index;
            }else {
                r=index;
            }
        }
        return nums.length;
    }
    public static void main(String[] args){
        LeetCode leetCode = new LeetCode();
        System.out.println(leetCode.searchInsert(new int[]{1,2,3},3));
        System.out.println(leetCode.searchInsert(new int[]{1,3,5,6},2));
        System.out.println(leetCode.searchInsert(new int[]{1,3,5,6},7));
        System.out.println(leetCode.searchInsert(new int[]{1,3,5,5},5));
        System.out.println(leetCode.searchInsert(new int[]{1,3,5,6},0));
        System.out.println(leetCode.searchInsert(new int[]{1},2));
    }
}
