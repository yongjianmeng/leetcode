package com.company.leetcode279;

class Solution {

    public int pow(int x) {
        return x * x;
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int temp = Integer.MAX_VALUE;
            int j = 1;
            while (i >= pow(j)) {
                temp = Math.min(dp[i - pow(j)], temp);
                j++;
            }
            dp[i] = temp + 1;
        }
        return dp[n];
    }
}