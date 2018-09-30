package com.company.leetcode45;

class Solution {
    public int jump(int[] nums) {
        int result = 0;
        int last = 0;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > last) {
                last = cur;
                result++;
            }
            cur = Math.max(cur, i + nums[i]);
        }
        return result;
    }
}