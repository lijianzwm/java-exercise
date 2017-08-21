package com.leetcode.easy;

/**
 * Created by IntelliJ IDEA.
 * User: lijian
 * Date: 2017-08-21
 * Time: 16:46
 * Description: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */

public class No26 {

    /**
     * Submission Result: Accepted
     * 需要注意的是，需要修改原来的数组nums
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int cnt = 0;
        if( nums.length >= 1 ) {
            cnt = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    nums[cnt] = nums[i+1];
                    ++cnt;
                }
            }
        }
        return cnt;
    }

    public static void main(String args[]){
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        System.out.println(removeDuplicates(nums));
        System.out.println(nums.toString());
    }

}
