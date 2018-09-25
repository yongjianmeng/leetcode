package com.company.leetcode139;

import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < s.length(); i++) {
            if (!dp[i]) {
                continue;
            }

            for (String word : wordDict) {
                int len = word.length();
                int end = i + len;
                if (end > s.length()) {
                    continue;
                }

                if (dp[end]) {
                    continue;
                }

                if (s.substring(i, end).equals(word)) {
                    dp[end] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
