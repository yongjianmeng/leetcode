package com.company.leetcode746;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 0) {
            return 0;
        }
        if (cost.length == 1) {
            return cost[0];
        }

        int[] minCosts = new int[cost.length];
        minCosts[0] = cost[0];
        minCosts[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int minCost = minCosts[i - 1] > minCosts[i - 2] ? minCosts[i - 2] : minCosts[i - 1];
            minCosts[i] = minCost + cost[i];
        }

        return Math.min(minCosts[cost.length - 1] , minCosts[cost.length - 2]);
    }
}
