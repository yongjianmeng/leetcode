package com.company.leetcode122;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }

        int[] diffs = new int[prices.length - 1];
        for (int i = 0; i < diffs.length; i++) {
            diffs[i] = prices[i + 1] - prices[i];
        }

        int maxProfit = 0;
        for (int i = 0; i < diffs.length; i++) {
            if (diffs[i] > 0) {
                maxProfit += diffs[i];
            }
        }
        return maxProfit;
    }
}
