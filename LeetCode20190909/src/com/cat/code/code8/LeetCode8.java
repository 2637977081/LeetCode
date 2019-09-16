package com.cat.code.code8;


/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode8 {
    public int myAtoi(String str) {
        StringBuffer ansBuffer = new StringBuffer();
        boolean mark = false;//是否出现符号位
        boolean symbol = true;//true正，false负
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '&&!mark){
                //空格不纳入
                continue;
            }else if(str.charAt(i)>'9'||str.charAt(i)<'0'){
                if(mark){
                    break;
                }else if(str.charAt(i)!='+'&&str.charAt(i)!='-'){
                    break;
                }else if(str.charAt(i)=='+') {
                    mark=true;//出现第一个有效符号
                }else if(str.charAt(i)=='-'){
                    mark=true;
                    symbol=false;
                }
            }else {
                mark=true;//出现第一个有效数字
                ansBuffer.append(str.charAt(i));
            }
        }
        int index =0;
        for (index=0;index<ansBuffer.length();index++){
            if(ansBuffer.charAt(index)!='0'){
                break;
            }
        }
        //2147483647
        String maxIntStr = ""+Integer.MAX_VALUE;
        //-2147483648
        String minIntStr = ""+Integer.MIN_VALUE;
        String ansStr = ansBuffer.substring(index);
        if(ansStr==null||ansStr.length()<1){
            return 0;
        }
        if(symbol){//正数
            if(ansStr.length()>maxIntStr.length()){
                return Integer.MAX_VALUE;
            }else if(ansStr.length()==maxIntStr.length()&&ansStr.compareTo(maxIntStr)>0){
                return Integer.MAX_VALUE;
            }
        }else {//负数
            ansStr="-"+ansStr;
            if(ansStr.length()>minIntStr.length()){
                return Integer.MIN_VALUE;
            }else if(ansStr.length()==minIntStr.length()&&ansStr.compareTo(minIntStr)>0){
                return Integer.MIN_VALUE;
            }
        }

        return Integer.valueOf(ansStr);
    }

    public static void main(String[] args){
        LeetCode8 leetCode = new LeetCode8();
        System.out.println(leetCode.myAtoi("-1"));
        System.out.println(leetCode.myAtoi("words and 987"));
        System.out.println(leetCode.myAtoi("  0000000000012345678"));
        System.out.println(leetCode.myAtoi("42"));
        System.out.println(leetCode.myAtoi(""));
        System.out.println(leetCode.myAtoi("-"));
        System.out.println(leetCode.myAtoi("+"));
        System.out.println(leetCode.myAtoi("+1"));
        System.out.println(leetCode.myAtoi("   -42"));
        System.out.println(leetCode.myAtoi("4193 with words"));
        System.out.println(leetCode.myAtoi("91283472332"));
        System.out.println(leetCode.myAtoi("-91283472332"));

    }
}
