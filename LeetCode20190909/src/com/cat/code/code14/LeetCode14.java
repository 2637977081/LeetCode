package com.cat.code.code14;


import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1){
            return "";
        }
        String perStr = strs[0];
        for(int i=1;i<strs.length;i++){
            while (strs[i].indexOf(perStr)!=0){
                perStr=perStr.substring(0,perStr.length()-1);
            }
            if(perStr.length()==0){
                return "";
            }
        }
        return perStr;
    }

    public static void main(String[] args){
        LeetCode14 leetCode = new LeetCode14();
        System.out.println(leetCode.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(leetCode.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(leetCode.longestCommonPrefix(new String[]{""}));
        System.out.println(leetCode.longestCommonPrefix(new String[]{}));
    }
}
