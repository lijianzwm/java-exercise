package com.leetcode.easy;

/**
 * Created by IntelliJ IDEA.
 * User: lijian
 * Date: 2017-08-17
 * Time: 18:48
 * Description: https://leetcode.com/problems/longest-common-prefix/description/
 */

public class No14 {

    /**
     * Submission Result: Memory Limit Exceeded
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder("");
        int idx = 0;
        boolean loop = true;
        while(loop) {
            Character c = null;
            for(String s: strs){
                if( idx >= s.length()){
                    loop = false;
                    break;
                }else{
                    if( c == null ){
                        c = s.charAt(idx);
                    }else{
                        if(s.charAt(idx) != c ){
                            loop = false;
                            break;
                        }
                    }
                }
            }
            if( loop ){
                result.append(c);
            }
        }
        return result.toString();
    }

    /**
     * Submission Result: Accepted
     * 思路：使用第一个字符赋值给prefix，同第2-n个字符串依次比较，找到两个字符串的最长公共子串，更新prefix
     *      不断缩小prefix，最终找到最长公共子串
     * @param strs
     * @return
     */
    public String longestCommonPrefix2(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(prefix) != 0)
            prefix = prefix.substring(0,prefix.length()-1);
            i++;
        }
        return prefix;
    }

}
