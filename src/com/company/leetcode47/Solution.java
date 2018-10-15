package com.company.leetcode47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        permuteUnique(results, new ArrayList<>(), nums, new boolean[nums.length]);
        return results;
    }


    private void permuteUnique(List<List<Integer>> results, List<Integer> tempList, int[] nums, boolean[] used) {
        if (tempList.size() == nums.length) {
            results.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;
            tempList.add(nums[i]);
            used[i] = true;
            permuteUnique(results, tempList, nums, used);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}