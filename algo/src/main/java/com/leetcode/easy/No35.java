package com.leetcode.easy;

/**
 * Created by lijian on 2017/8/23.
 * https://leetcode.com/problems/search-insert-position/description/
 */
public class No35 {

    /**
     * Submission Result: Accepted
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        for(int i = 0; i < nums.length; i++ ){
            if( nums[i] < target ){
                pos = i+1;
            }
            if( nums[i] == target){
                pos = i;
            }
        }
        return pos;
    }
}
