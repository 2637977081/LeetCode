package com.cat.code.code26;

public class LeetCode {

    public int removeDuplicates(int[] nums) {
        int i = 0,j=1;
        while (j<nums.length){
            //不相等移动左指针
            if (nums[i] != nums[j]) {
                i++;
                //挪动数字位置
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }

    public static void  main(String[] args){
        LeetCode leetCode = new LeetCode();
        System.out.println(leetCode.removeDuplicates(new int[]{1,1,2}));
    }
}
