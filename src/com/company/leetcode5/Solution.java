package com.company.leetcode5;

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        int maxI = 0;
        int maxJ = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    dp[i][j] = true;
                } else if ((i + 1) == j) {
                    dp[i][j] = s.charAt(i) == s.charAt(j) ? true : false;
                } else if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = false;
                }

                if (dp[i][j] && (j - i) > (maxJ - maxI)) {
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        return s.substring(maxI, maxJ + 1);
    }
}