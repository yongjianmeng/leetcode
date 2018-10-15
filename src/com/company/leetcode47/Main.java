package com.company.leetcode47;

import com.company.utils.LeetCodeUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> results = solution.permuteUnique(new int[] { 1,1,2,3,4 });
        for (List<Integer> result : results) {
            LeetCodeUtils.printList(result);
        }
    }
}
