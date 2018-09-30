package com.company.leetcode55;

class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 0) {
            return false;
        }

        if (nums.length == 1) {
            return true;
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == 0) {
                boolean canJumpOver = false;
                for (int j = 0; j < i; j++) {
                    if (nums[j] > (i - j)) {
                        canJumpOver = true;
                    }
                }
                if (!canJumpOver) {
                    return false;
                }
            }
        }

        return true;
    }
}