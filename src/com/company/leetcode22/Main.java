package com.company.leetcode22;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> results = solution.generateParenthesis(100);
        for (String result : results) {
            System.out.println(result);
        }
    }
}
