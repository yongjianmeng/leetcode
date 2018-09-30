package com.company.leetcode45;

class DPSolution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                // if reachable
                if (nums[j] >= (i - j)) {
                    // if less than min
                    if ((dp[j] + 1) < min) {
                        min = dp[j] + 1;
                    }
                }
            }
            dp[i] = min;
        }

        return dp[nums.length - 1];
    }
}