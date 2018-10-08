package com.company.leetcode268;

class Solution {
    public int missingNumber(int[] nums) {
        boolean isExceedFlagSet = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums.length) {
                isExceedFlagSet = true;
                nums[i] = -1;
            }
        }
        if (!isExceedFlagSet) {
            return nums.length;
        }

        for (int i = 0; i < nums.length; i++) {
            while(nums[i] != -1 && nums[i] != i) {
                int tmp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = tmp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) {
                return i;
            }
        }
        return -1;
    }
}