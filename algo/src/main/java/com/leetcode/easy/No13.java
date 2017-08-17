package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: lijian
 * Date: 2017-08-17
 * Time: 18:08
 * Description: https://leetcode.com/problems/roman-to-integer/description/
 * DCXXI = 621  => 500 + 100 + 10 + 10 + 1
 * MCMXCVI = 1996
 * 1000 + 100 + 1000 + 10 + 100 + 5 + 1
 */

public class No13 {
    public static int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int result = 0;
        for(int i = 0; i < s.length()-1; i++ ){
            int digit1 = m.get(s.charAt(i));
            int digit2 = m.get(s.charAt(i+1));
            if( digit1 < digit2 ){
                result -= digit1;
            }else{
                result += digit1;
            }
            System.out.println(result);
        }
        result += m.get(s.charAt(s.length() - 1));
        return result;
    }

    public static void main(String args[]){
        System.out.println(romanToInt("DCXXI"));
    }

}
