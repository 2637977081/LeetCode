package com.cat.code.code20;

import java.util.Stack;

public class LeetCode20 {

    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        //字符不是双数直接排除
        if(s.length()%2!=0){
            return false;
        }
        int index=0;
        for(;index<s.length();index++){

            String temp = s.substring(index,index+1);
            //左括号入栈
            if(temp.equals("(")||temp.equals("{")||temp.equals("[")){
                stack.push(temp);
            }
            //右括号出栈,出栈不是对应左括号返回错误
            if(temp.equals(")")){
                if(stack.empty()||!stack.pop().equals("(")){
                    return false;
                }
            }
            //右括号出栈,出栈不是对应左括号返回错误
            if(temp.equals("}")){
                if(stack.empty()||!stack.pop().equals("{")){
                    return false;
                }
            }
            //右括号出栈
            //右括号出栈,出栈不是对应左括号返回错误
            if(temp.equals("]")){
                if(stack.empty()||!stack.pop().equals("[")){
                    return false;
                }
            }
        }
        if(stack.empty()&&index==s.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        LeetCode20 leetCode = new LeetCode20();
        System.out.println(leetCode.isValid("()"));
        System.out.println(leetCode.isValid("()[]{}"));
        System.out.println(leetCode.isValid("([)]"));
        System.out.println(leetCode.isValid("{[]}"));
        System.out.println(leetCode.isValid("}{"));
    }
}
