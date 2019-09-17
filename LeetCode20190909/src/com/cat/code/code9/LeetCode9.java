package com.cat.code.code9;


/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode9 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else if(x<10){
            return true;
        }else if(x%10==0){
            return false;
        }
        int tenTemp =1;
        int headNum = x;//前部分
        int tailNum = 0;//后部分
        while (tailNum<headNum){
            tailNum=tailNum*10+headNum%10;
            headNum=headNum/10;
            tenTemp*=10;
        }
        //11这种情况
        if(tailNum==headNum){
            return true;
        }
        //121这种情况
        if(headNum==x%(tenTemp/10)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        LeetCode9 leetCode = new LeetCode9();
        System.out.println(leetCode.isPalindrome(0));
        System.out.println(leetCode.isPalindrome(10));
        System.out.println(leetCode.isPalindrome(100));
        System.out.println(leetCode.isPalindrome(123123));
        System.out.println(leetCode.isPalindrome(-123));
        System.out.println(leetCode.isPalindrome(-121));
        System.out.println(leetCode.isPalindrome(1));
        System.out.println(leetCode.isPalindrome(11));
        System.out.println(leetCode.isPalindrome(121));
        System.out.println(leetCode.isPalindrome(1221));
        System.out.println(leetCode.isPalindrome(12321));

    }
}
