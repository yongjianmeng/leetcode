package com.company.leetcode10;

class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;

        // init for a*, .*, a*b*, a*b*c*
        for (int j = 1; j < dp[0].length; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                // match '.' or same charater
                if (p.charAt(j - 1) == '.' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    // 0 occurrence.
                    dp[i][j] = dp[i][j - 2];
                    // if 0 occurrence not match.
                    if (!dp[i][j]) {
                        // compare if any count character match.
                        if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                            dp[i][j] = dp[i - 1][j];
                        }
                    }
                } else {
                    // not same character
                    dp[i][j] = false;
                }
            }
        }

        return dp[s.length()][p.length()];
    }
}