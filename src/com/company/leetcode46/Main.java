package com.company.leetcode46;

import com.company.utils.LeetCodeUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> results = solution.permute(new int[] { });
        for (List<Integer> result : results) {
            LeetCodeUtils.printList(result);
        }
    }
}
