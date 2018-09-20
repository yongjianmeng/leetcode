package com.company.leetcode64;

class Solution {
    public int minPathSum(int[][] grid) {
        int rowNum = grid.length;
        if (rowNum == 0) {
            return 0;
        }

        int colNum = grid[0].length;
        if (colNum == 0) {
            return 0;
        }

        int[][] dp = new int[rowNum][colNum];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < rowNum; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < colNum; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < rowNum; i++) {
            for (int j = 1; j < colNum; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        return dp[rowNum - 1][colNum - 1];
    }
}