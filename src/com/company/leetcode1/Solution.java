package com.company.leetcode1;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            valueIndexMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (valueIndexMap.containsKey(diff) && valueIndexMap.get(diff) != i) {
                return new int[] { i, valueIndexMap.get(diff) };
            }
        }

        return null;
    }

}