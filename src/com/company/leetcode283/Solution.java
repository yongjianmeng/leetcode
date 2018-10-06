package com.company.leetcode283;

class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                if (zeroCount > 0) {
                    nums[i - zeroCount] = nums[i];
                    for (int j = (i - zeroCount + 1); j <= i; j++) {
                        nums[j] = 0;
                    }
                }
            }
        }
    }
}
