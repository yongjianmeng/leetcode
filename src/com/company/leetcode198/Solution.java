package com.company.leetcode198;

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        // max[i - 2] -> max[i - 1] -> nums[i] ?
        // if take nums[i], then max[i - 2] + nums[i]
        // if not, then max[i - 1]
        int[] max = new int[nums.length];
        max[0] = nums[0];
        max[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        for (int i = 2; i < nums.length; i++) {
            int max1 = max[i - 2] + nums[i];
            if (max1 > max[i - 1]) {
                max[i] = max1;
            } else {
                max[i] = max[i - 1];
            }
        }
        return max[nums.length - 1];
    }
}