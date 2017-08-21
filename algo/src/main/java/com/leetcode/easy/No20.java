package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: lijian
 * Date: 2017-08-21
 * Time: 13:19
 * Description: https://leetcode.com/problems/valid-parentheses/description/
 */

public class No20 {

    /**
     * Submission Result: Accepted
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<Character>();
        Map<Character,Character> m = new HashMap<Character, Character>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');
        for(char c: s.toCharArray()){
            if( c == '(' || c == '[' || c == '{'){
                parentheses.push(c);
            }
            if( c == ')' || c == ']' || c == '}'){
                if( parentheses.size() == 0 ){
                    return false;
                }
                char top = parentheses.pop();
                if( top != m.get(c)){
                    return false;
                }
            }
        }
        if( parentheses.size() == 0 ){
            return true;
        }else{
            return false;
        }
    }
}
