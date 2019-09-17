package com.cat.code.code12;


/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode12 {
    public String intToRoman(int num) {
        /**
         * I             1
         * V             5
         * X             10
         * L             50
         * C             100
         * D             500
         * M             1000
         */
        StringBuffer stringBuffer = new StringBuffer();
        int mNum = num/1000;
        for(int i=0;i<mNum;i++){
            stringBuffer.append("M");
        }

        int cNum = (num/100)%10;

        if(cNum==9){
            stringBuffer.append("CM");
        } else if(4<cNum&&cNum<9){
            stringBuffer.append("D");
            for (int i=0;i<cNum-5;i++){
                stringBuffer.append("C");
            }
        }else if(cNum==4){
            stringBuffer.append("CD");
        }else {
            for (int i=0;i<cNum;i++){
                stringBuffer.append("C");
            }
        }

        int xNum = (num/10)%10;
        if(xNum==9){
            stringBuffer.append("XC");
        } else if(4<xNum&&xNum<9){
            stringBuffer.append("L");
            for (int i=0;i<xNum-5;i++){
                stringBuffer.append("X");
            }
        }else if(xNum==4){
            stringBuffer.append("XL");
        }else {
            for (int i=0;i<xNum;i++){
                stringBuffer.append("X");
            }
        }

        int iNum = num%10;
        if(iNum==9){
            stringBuffer.append("IX");
        } else if(4<iNum&&iNum<9){
            stringBuffer.append("V");
            for (int i=0;i<iNum-5;i++){
                stringBuffer.append("I");
            }
        }else if(iNum==4){
            stringBuffer.append("IV");
        }else {
            for (int i=0;i<iNum;i++){
                stringBuffer.append("I");
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args){
        LeetCode12 leetCode = new LeetCode12();
        System.out.println(leetCode.intToRoman(3));
        System.out.println(leetCode.intToRoman(4));
        System.out.println(leetCode.intToRoman(8));
        System.out.println(leetCode.intToRoman(9));
        System.out.println(leetCode.intToRoman(58));
        System.out.println(leetCode.intToRoman(1994));
    }
}
