package com.cat.code.code5;


/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode5 {
    public String longestPalindrome(String s) {
        if(s==null||s.length()<1) {
            return "";
        }
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            int singleLen = getNowLen(s,i,i);
            int doubleLen = getNowLen(s,i,i+1);
            int len = Math.max(singleLen,doubleLen);
            if(len>end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);
    }

    //获取当前坐标为中心的最大回文长度
    public int getNowLen(String s,int left,int right){
        int len = s.length();
        //以当前坐标为中心展开
        while (left>-1&&right<len&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args){
        LeetCode5 leetCode = new LeetCode5();
        System.out.println(leetCode.longestPalindrome("babad"));
        System.out.println(leetCode.longestPalindrome("bbbbb"));
        System.out.println(leetCode.longestPalindrome("ab"));
        System.out.println(leetCode.longestPalindrome("a"));
        System.out.println(leetCode.longestPalindrome("abcabcbb"));
    }
}
