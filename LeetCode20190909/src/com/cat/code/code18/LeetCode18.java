package com.cat.code.code18;


import java.util.*;

/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode18 {
    public List<List<Integer>> fourSum(int[] nums,int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length-3;i++) {
            for (int j = nums.length-1; j > 2; j--) {
                int l = i + 1, r = j-1;
                while (l < r) {
                    int nowNum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (nowNum > target) {
                        r--;
                    } else if (nowNum < target) {
                        l++;
                    } else {
                        List<Integer> nowList = new ArrayList<>();
                        nowList.add(nums[i]);
                        nowList.add(nums[l]);
                        nowList.add(nums[r]);
                        nowList.add(nums[j]);
                        set.add(nowList);
                        l++;
                    }
                }

            }
        }
        lists.addAll(set);
        return lists;
    }

    public static void main(String[] args){
        LeetCode18 leetCode = new LeetCode18();
        System.out.println(leetCode.fourSum(new int[]{1, 0, -1, 0, -2, 2},0));
//        System.out.println(leetCode.fourSum(new int[]{-3,-2,-1,0,0,1,2,3},0));
        System.out.println(leetCode.fourSum(new int[]{1,-2,-5,-4,-3,3,3,5},-11));
    }
}
