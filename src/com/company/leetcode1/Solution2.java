package com.company.leetcode1;

import java.util.HashMap;
import java.util.Map;

class Solution2 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (valueIndexMap.containsKey(diff)) {
                return new int[] { valueIndexMap.get(diff), i };
            }
            valueIndexMap.put(nums[i], i);
        }

        return null;
    }

}