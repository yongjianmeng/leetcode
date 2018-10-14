package com.company.leetcode118;

import com.company.utils.LeetCodeUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> results = solution.generate(10);
        for (List<Integer> items : results) {
            LeetCodeUtils.printList(items);
        }
    }
}
