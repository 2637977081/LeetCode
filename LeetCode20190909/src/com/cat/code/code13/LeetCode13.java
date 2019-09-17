package com.cat.code.code13;


import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lvgang
 * @Time: 2019/9/11 13:39
 * @Email: lvgang@golaxy.cn
 * @Description: todo
 */
public class LeetCode13 {
    public int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("M",1000);map.put("CM",900);
        map.put("DCCC",800);map.put("DCC",700);map.put("DC",600);map.put("D",500);
        map.put("CD",400);map.put("CCC",300);map.put("CC",200);map.put("C",100);
        map.put("XC",90);
        map.put("LXXX",80);map.put("LXX",70);map.put("LX",60);map.put("L",50);
        map.put("XL",40);map.put("XXX",30);map.put("XX",20);map.put("X",10);
        map.put("IX",9);
        map.put("VIII",8);map.put("VII",7);map.put("VI",6);map.put("V",5);
        map.put("IV",4);map.put("III",3);map.put("II",2);map.put("I",1);
        int ans = 0;
        for (int i=0;i<s.length();){
            for(int j=4;j>=1;j--){
                if((i+j)<=s.length()&&map.get(s.substring(i,i+j))!=null){
                    ans+=map.get(s.substring(i,i+j));
                    i+=j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        LeetCode13 leetCode = new LeetCode13();
        System.out.println(leetCode.romanToInt("MCMXCIV"));
        System.out.println(leetCode.romanToInt("III"));
        System.out.println(leetCode.romanToInt("IV"));
        System.out.println(leetCode.romanToInt("IX"));
        System.out.println(leetCode.romanToInt("LVIII"));
    }
}
