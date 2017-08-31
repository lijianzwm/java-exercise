package com.leetcode.easy;

/**
 * Created by IntelliJ IDEA.
 * User: lijian
 * Date: 2017-08-25
 * Time: 13:04
 * Description: https://leetcode.com/problems/add-binary/description/
 */

public class No67 {

    /**
     * Submission Result: Accepted
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {

        char[] m, n;

        if (a.length() < b.length()) {
            m = b.toCharArray();
            n = a.toCharArray();
        }else{
            m = a.toCharArray();
            n = b.toCharArray();
        }

        int[] tmp = new int[m.length];

        //按位相加
        for( int i = 0; i < m.length; i++ ){
            if( n.length-i-1 >= 0 ) {
                tmp[m.length - i - 1] = m[m.length - i - 1] - '0' + n[n.length - i - 1] - '0';
            }else{
                tmp[m.length - i - 1] = m[m.length - i - 1] - '0';
            }
        }

        //处理进位
        for( int i = tmp.length-1; i >=0; i-- ){
            if( tmp[i] > 1 && i-1 >= 0){
                tmp[i-1] += 1;
                tmp[i] -= 2;
            }
        }

        StringBuilder sb = new StringBuilder();
        for( int digit: tmp ){
            if( digit > 1 ){
                sb.append("1");
                sb.append(digit-2);
            }else{
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        System.out.println(addBinary("1111", "1111"));
    }

}
