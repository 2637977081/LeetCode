package com.cat.code.code7;


/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode7 {
    public int reverse(int x) {
        //2147483647
        String maxIntStr = ""+Integer.MAX_VALUE;
        //-2147483648
        String minIntStr = ""+Integer.MIN_VALUE;
        String xStr = ""+x;
        boolean symbol = false;
        if(xStr.indexOf("-")>-1){
            xStr=xStr.replace("-","");
            symbol=true;
        }
        StringBuffer stringBuffer = new StringBuffer(xStr);
        stringBuffer.reverse();
        String ansStr = stringBuffer.toString();

        if(!symbol){
            if(ansStr.length()>maxIntStr.length()){
                return 0;
            }else if(ansStr.length()==maxIntStr.length()&&ansStr.compareTo(maxIntStr)>0){
                return 0;
            }
        }
        if(ansStr.compareTo(minIntStr)>0&&symbol){
            ansStr="-"+ansStr;
            if(ansStr.length()>minIntStr.length()){
                return 0;
            }else if(ansStr.length()==minIntStr.length()&&ansStr.compareTo(minIntStr)>0){
                return 0;
            }
        }
        return Integer.valueOf(ansStr);
    }

    public static void main(String[] args){
        LeetCode7 leetCode = new LeetCode7();
        System.out.println(leetCode.reverse(1));
        System.out.println(leetCode.reverse(-1));
        System.out.println(leetCode.reverse(0));
        System.out.println(leetCode.reverse(2147483647));
        System.out.println(leetCode.reverse(123));
        System.out.println(leetCode.reverse(120));
        System.out.println(leetCode.reverse(-120));
        System.out.println(leetCode.reverse(2147483642));
        System.out.println(leetCode.reverse(2147483312));
        System.out.println(leetCode.reverse(-2147483648));
        System.out.println(leetCode.reverse(-1147483641));
    }
}
