package com.cat.code.code29;

public class LeetCode {

    public int divide(int dividend, int divisor) {
        int symbol = (dividend>0&&divisor>0)||(dividend<0&&divisor<0)?1:-1;
        if(divisor==0||dividend==0){
            return 0;
        }
        int num = 0,dividend1 = dividend,divisor1=divisor;
        while (true){
            if(dividend1>divisor1){
                dividend1 = dividend1 - divisor1;
                divisor1=divisor1+divisor1;
                num++;
            }else {
                break;
            }
        }
        return 0;
    }

    public static void  main(String[] args){
        LeetCode leetCode = new LeetCode();
        System.out.println(leetCode.divide(7,3));
    }
}
