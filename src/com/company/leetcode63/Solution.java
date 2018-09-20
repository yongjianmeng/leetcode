package com.company.leetcode63;

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowNum = obstacleGrid.length;
        if (rowNum == 0) {
            return 0;
        }

        int colNum = obstacleGrid[0].length;
        if (colNum == 0) {
            return 0;
        }

        if (obstacleGrid[rowNum - 1][colNum - 1] == 1) {
            return 0;
        }

        int[][] dp = new int[rowNum][colNum];
        boolean canReach = true;
        for (int i = 0; i < colNum; i++) {
            if (canReach && obstacleGrid[0][i] == 0) {
                dp[0][i] = 1;
            } else {
                canReach = false;
                dp[0][i] = 0;
            }
        }

        canReach = true;
        for (int i = 0; i < rowNum; i++) {
            if (canReach && obstacleGrid[i][0] == 0) {
                dp[i][0] = 1;
            } else {
                canReach = false;
                dp[i][0] = 0;
            }
        }

        for (int i = 1; i < rowNum; i++) {
            for (int j = 1; j < colNum; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[rowNum - 1][colNum - 1];
    }
}