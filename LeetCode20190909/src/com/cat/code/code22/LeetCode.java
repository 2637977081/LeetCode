package com.cat.code.code22;


import java.util.ArrayList;
import java.util.List;

public class LeetCode {

    private  List<String> list = new ArrayList<>();
    private int n;

    public List<String> generateParenthesis(int n) {
        this.n = n;
        backTrack("",0,0);
        return list;
    }
    private void backTrack(String s,int l,int r){
        //l和r分别代表左右括号个数
        if(s.length()==n*2){
            list.add(s);
            return;
        }
        //优先添加左括号，括号数小于n
        if(l<n){
            s=s+"(";
            backTrack(s,l+1,r);
            //剔除多余的左括号
            s = s.substring(0,s.length()-1);
        }
        if(r<l){
            s=s+")";
            backTrack(s,l,r+1);
        }
    }


    public static void main(String[] args){
        LeetCode leetCode = new LeetCode();
        System.out.println(leetCode.generateParenthesis(3));
    }
}
