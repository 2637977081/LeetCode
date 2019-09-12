package com.cat.code.code6;


/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode6 {
    public String convert(String s, int numRows) {
        if(numRows<=1){
            return s;
        }
        int maxAdd = 2*(numRows-1);
        int maxCol = s.length()/maxAdd+1;
        if(maxCol<1){
            return s;
        }
        StringBuffer ans = new StringBuffer();
        for(int row=0;row<numRows;row++){
            for(int col=0;col<maxCol;col++){
                int nowIndex = col*maxAdd+row;
                if(nowIndex<s.length()){
                   ans.append(s.charAt(nowIndex));
                }
                int nextIndex = (col+1)*maxAdd-row;
                if(nextIndex<s.length()&&row!=0&&row!=numRows-1){
                    ans.append(s.charAt(nextIndex));
                }
            }

        }

        return ans.toString();
    }

    public static void main(String[] args){
        LeetCode6 leetCode = new LeetCode6();

        System.out.println(leetCode.convert("A",1));
        System.out.println(leetCode.convert("ABC",2));
        System.out.println(leetCode.convert("LEETCODEISHIRING",1));
        System.out.println(leetCode.convert("abcdef",2));
        System.out.println("LCIRETOESIIGEDHN");
        System.out.println(leetCode.convert("LEETCODEISHIRING",3));
        System.out.println("LDREOEIIECIHNTSG");
        System.out.println(leetCode.convert("LEETCODEISHIRING",4));
    }
}
