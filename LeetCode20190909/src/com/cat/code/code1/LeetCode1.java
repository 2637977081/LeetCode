package com.cat.code.code1;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {


    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,String> map = new HashMap<>();
        //将所有数值存入map中
        for(int i=0;i<nums.length;i++){
            String value = i+",";
            if(map.get(nums[i])!=null){
                value = map.get(nums[i])+value;
            }
            map.put(nums[i],value);
        }
        //现在找到该数字
        for(int i=0;i<nums.length;i++){
            int temp = target - nums[i];
            String value = map.get(nums[i]);
            value = value.substring((""+i).length()+1,value.length());
            map.put(nums[i],value);

            String tempString = map.get(temp);
            if(tempString!=null&&!tempString.equals("")){
                result[0] = i;
                result[1] =Integer.valueOf(tempString.substring(0,tempString.indexOf(",")));
                break;
            }
        }
        return result;
    }
    public static void main(String[] args){
        LeetCode1 leetCode1 = new LeetCode1();
        int[] result =leetCode1.twoSum(new int[]{3, 3, 3, 15},6);
        System.out.println(result[0]+"---"+result[1]);
    }
}
