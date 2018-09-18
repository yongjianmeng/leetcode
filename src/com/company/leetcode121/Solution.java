package com.company.leetcode121;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }

        int minPrice = prices[0];
        int maxDiff = 0;

        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - minPrice;
            if (diff > maxDiff) {
                maxDiff = diff;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxDiff;
    }
}