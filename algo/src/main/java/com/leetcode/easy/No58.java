package com.leetcode.easy;

/**
 * Created by IntelliJ IDEA.
 * User: lijian
 * Date: 2017-08-24
 * Time: 12:38
 * Description: https://leetcode.com/problems/length-of-last-word/description/
 */

public class No58 {

    /**
     * Submission Result: Accepted
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int space = s.lastIndexOf(' ');
        if( s.length() == 0 ){
            return 0;
        }else if( space == -1 ){
            return s.length();
        }else{
            return s.length() - (space+1);
        }
    }

    public static void main(String args[] ){
        System.out.println(lengthOfLastWord("a b "));
    }

}
