package com.company.leetcode128;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            if (map.get(num) == null) {
                int left = map.get(num - 1) != null ? map.get(num - 1) : 0;
                int right = map.get(num + 1) != null ? map.get(num + 1) : 0;
                int sum = left + 1 + right;
                map.put(num, sum);

                res = Math.max(sum, res);

                map.put(num - left, sum);
                map.put(num + right, sum);
            }
        }
        return res;
    }
}