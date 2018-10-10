package com.company.leetcode169;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            if (counts.get(num) == null) {
                counts.put(num, 1);
            } else {
                int currentCount = counts.get(num);
                if (((currentCount + 1) * 2) > nums.length) {
                    return num;
                } else {
                    counts.put(num, currentCount + 1);
                }
            }
        }
        return -1;
    }
}
