package com.company.leetcode17;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> results = solution.letterCombinations("789");
        for (String result : results) {
            System.out.println(result);
        }
    }
}
