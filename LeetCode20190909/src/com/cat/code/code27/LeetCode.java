package com.cat.code.code27;

public class LeetCode {

    public int removeElement(int[] nums, int val) {
        int i=0,j=0;
        while (j<nums.length){
            //不相等移动左指针
            if (nums[j] != val) {
                //挪动数字位置
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }

    public static void  main(String[] args){
        LeetCode leetCode = new LeetCode();
        System.out.println(leetCode.removeElement(new int[]{3,2,2,3},3));
        System.out.println(leetCode.removeElement(new int[]{3,2,2},3));
        System.out.println(leetCode.removeElement(new int[]{2,2},3));
        System.out.println(leetCode.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
