package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: lijian
 * Date: 2017-08-08
 * Time: 14:06
 * Description:
 */

public class No1 {

    /**
     * [AC]
     * 暴力解法，O(n^2)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * [AC]
     * 将所有元素映射到哈希表，直接找哈希表中是否有
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> num2index = new HashMap<Integer, Integer>();
        for( int i = 0; i < nums.length; i++ ){
            num2index.put(nums[i], i);
        }
        for( int i = 0; i < nums.length; i++ ){
            int complement = target - nums[i];
            if (num2index.containsKey(complement)) {
                return new int[]{i, num2index.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
