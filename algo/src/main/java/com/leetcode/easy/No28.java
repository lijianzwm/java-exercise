package com.leetcode.easy;

/**
 * Created by IntelliJ IDEA.
 * User: lijian
 * Date: 2017-08-21
 * Time: 17:18
 * Description: https://leetcode.com/problems/implement-strstr/description/
 */

public class No28 {
    /**
     * 最简单粗暴的解法
     * Submission Result: Accepted
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle){
        char[] needleChar = needle.toCharArray();
        char[] haystackChar = haystack.toCharArray();

        for( int i = 0; i <= haystackChar.length-needleChar.length; i++ ){
            boolean found = true;
            for( int j = 0; j < needleChar.length; j++ ){
                if( needleChar[j] != haystackChar[i+j] ){
                    found = false;
                    break;
                }
            }
            if( found ){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        System.out.println(strStr("mississippi","sippia"));
        System.out.println(strStr("a","a"));
    }
}
