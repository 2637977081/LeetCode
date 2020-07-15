package com.cat.code.code17;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode17 {


    private List<String> res;
    private String digits;
    private String[] letters=new String[]{
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };

    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        this.digits=digits;
        if(digits.equals("")){
            return res;
        }
        concatLetter(0,"");
        return res;
    }

    private void concatLetter(int index,String s){
        if(index<digits.length()){
            String letter = letters[digits.charAt(index)-'0'];
            for(int i=0;i<letter.length();i++){
                concatLetter(index+1,s+letter.charAt(i));
            }
        }else {
            res.add(s);
            return;
        }
    }

    public static void main(String[] args){
        LeetCode17 leetCode = new LeetCode17();
        System.out.println(leetCode.letterCombinations("23"));
    }
}
