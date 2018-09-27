package com.company.leetcode11;

class Solution {
    public int maxArea(int[] height) {
        int[] dp = new int[height.length];
        dp[0] = 0;
        for (int i = 1; i < height.length; i++) {
            int curMax = 0;
            for (int j = 0; j < i; j++) {
                int volume = Math.min(height[i], height[j]) * (i - j);
                if (volume > curMax) {
                    curMax = volume;
                }
            }
            dp[i] = Math.max(dp[i - 1], curMax);
        }
        return dp[height.length - 1];
    }
}
