package com.cat.code.code167;


public class LeetCode {

    public int[] twoSum(int[] numbers, int target) {
        int l =0,r=numbers.length-1;
        while (l<r){
            int now = numbers[l]+numbers[r];
            if(now==target){
                break;
            }
            if(now<target){
                l++;
            }
            if(now>target){
                r--;
            }
        }
        return new int[]{l+1,r+1};
    }
    
    public static void main(String[] args){
        LeetCode leetCode = new LeetCode();
        int[] ary = leetCode.twoSum(new int[]{2, 7, 11, 15},9);
        System.out.println(ary[0]+"-"+ary[1]);
    }
}
