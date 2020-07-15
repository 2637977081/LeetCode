package com.cat.code.code15;


import java.util.*;

/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> indexMap = new HashMap<>();
        Map<String,Integer> markMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            indexMap.put(nums[i],i);
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int i=0;i<nums.length-1;i++){

            for (int j=i+1;j<nums.length;j++){
                int num = 0-nums[i]-nums[j];
                if(indexMap.get(num)!=null){
                    if(indexMap.get(num)>j&&markMap.get(nums[i]+""+nums[j])==null){
                        List<Integer> integerList = new ArrayList<>();
                        integerList.add(nums[i]);
                        integerList.add(nums[j]);
                        integerList.add(num);
                        lists.add(integerList);
                        markMap.put(nums[i]+""+nums[j],num);
                    }
                }
            }
        }
        return lists;
    }

    public static void main(String[] args){
        LeetCode15 leetCode = new LeetCode15();
        System.out.println(leetCode.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
