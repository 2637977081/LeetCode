package com.cat.code.code3;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i=0,j=0,res=0,len=s.length();
        while (i<len&&j<len){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));//移除重复字符
                i++;//左游标+1
            }else{
                set.add(s.charAt(j));//添加到集合中
                j++;//右游标+1
                res = Math.max(res,j-i);//记录当前最大值
            }
        }
        return res;
    }

    public static void main(String[] args){
        LeetCode3 leetCode = new LeetCode3();
        System.out.println(leetCode.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(leetCode.lengthOfLongestSubstring("bbbbb"));
        System.out.println(leetCode.lengthOfLongestSubstring("ab"));
        System.out.println(leetCode.lengthOfLongestSubstring("a"));
        System.out.println(leetCode.lengthOfLongestSubstring("abcabcbb"));
    }
}
