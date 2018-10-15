package com.company.leetcode46;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        premute(results, new ArrayList<>(), nums);
        return results;
    }

    private void premute(List<List<Integer>> results, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            results.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i])) continue;
            tempList.add(nums[i]);
            premute(results, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }
    }
}