package com.leetcode.easy;

/**
 * Created by IntelliJ IDEA.
 * User: lijian
 * Date: 2017-08-24
 * Time: 12:49
 * Description: https://leetcode.com/problems/plus-one/description/
 */

public class No66 {

    /**
     * Submission Result: Accepted
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        int idx = digits.length-1;
        while( digits[idx] >= 10 ){
            if( idx == 0 ){
                int[] result = new int[digits.length+1];
                result[0] = digits[0] / 10;
                digits[0] %= 10;
                for( int i = 0; i < digits.length; i++ ){
                    result[i+1] = digits[i];
                }
                return result;
            }else{
                digits[idx-1] += digits[idx] / 10;
                digits[idx] %= 10;
                --idx;
            }
        }
        return digits;
    }

}
