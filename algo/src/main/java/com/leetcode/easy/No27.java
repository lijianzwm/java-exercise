package com.leetcode.easy;

/**
 * Created by IntelliJ IDEA.
 * User: lijian
 * Date: 2017-08-21
 * Time: 17:09
 * Description: https://leetcode.com/problems/remove-element/description/
 */

public class No27 {
    /**
     * Submission Result: Accepted
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for(int i = 0; i < nums.length; i++ ){
            if( nums[i] != val ){
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}
