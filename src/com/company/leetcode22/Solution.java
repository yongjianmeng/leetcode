package com.company.leetcode22;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        generator(n, n, "", results);
        return results;
    }

    private void generator (int left, int right, String result, List<String> results) {
        if (left < 0 || right < 0 || left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            results.add(result);
            return;
        }
        generator(left - 1, right, result + "(", results);
        generator(left, right - 1, result + ")", results);
    }
}