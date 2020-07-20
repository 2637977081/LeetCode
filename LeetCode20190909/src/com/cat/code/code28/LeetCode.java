package com.cat.code.code28;

public class LeetCode {

    //
    private int[] getNext(String s){
        int i=0,j=-1;
        int next[] = new int[s.length()*2];
        next[0]=-1;
        while (i<s.length()-1){
            if(j==-1||s.charAt(i)==s.charAt(j)){
                i++;j++;
                next[i]=j;
            }else {
                j = next[j];
            }
        }
        return next;
    }

    //kmp
    public int strStr(String haystack, String needle) {
        if(needle.length()<1){
            return 0;
        }
        int[] next = getNext(needle);
        int i=0,j=0;
        while (i<haystack.length()&&j<needle.length()){
            if(j==-1 || haystack.charAt(i)==needle.charAt(j)){
                ++i;++j;
            }else {
                //回退
                j = next[j];
            }
        }
        if(j>=needle.length()){
            return i-needle.length();
        }
        return -1;
    }

    public static void  main(String[] args){
        LeetCode leetCode = new LeetCode();
//        System.out.println(leetCode.strStr("aabb","ab"));
//        System.out.println(leetCode.strStr("abb","ab"));
//        System.out.println(leetCode.strStr("babb","ab"));
//        System.out.println(leetCode.strStr("babb","b"));
//        System.out.println(leetCode.strStr("babb","abb"));
//        System.out.println(leetCode.strStr("babb","c"));
//        System.out.println(leetCode.strStr("","a"));
//        System.out.println(leetCode.strStr("",""));
//        System.out.println(leetCode.strStr("aaaaa","bba"));
        System.out.println(leetCode.strStr("mississippi","issip"));
        System.out.println(leetCode.strStr("mississippi","ABCDABD"));
    }
}
