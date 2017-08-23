package com.leetcode.easy;

/**
 * Created by lijian on 2017/8/23.
 * https://leetcode.com/problems/count-and-say/description/
 */
public class No38 {
    /**
     1.     1
     2.     11
     3.     21
     4.     1211
     5.     111221
     6.     312211
     7.     13112221
     8.     1113213211
     9.     31
     */

    /**
     * Submission Result: Accepted
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        return count("1", n-1);
    }
    private String count(String str, int n){
        if( n == 0 ){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] c = str.toCharArray();
        char curChar = c[0];
        int cnt = 0;
        for( int i = 0; i < c.length; i++ ){
            if( c[i] == curChar ){
                ++cnt;
            }else{
                sb.append(cnt);
                sb.append(curChar);
                curChar = c[i];
                cnt = 1;
            }
        }
        sb.append(cnt);
        sb.append(curChar);
        return count(sb.toString(), n-1);
    }

}
