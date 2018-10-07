package com.company.leetcode347;

import java.util.*;

class Solution {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> items = new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<Integer, Integer>> comparator = (o1, o2) -> o2.getValue() - o1.getValue();

        Collections.sort(items, comparator);

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(items.get(i).getKey());
        }
        return res;
    }

}