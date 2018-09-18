package com.company.leetcode70;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private static Map<Integer, Integer> cache = new HashMap<>();

    static {
        cache.put(1, 1);
        cache.put(2, 2);
    }

    public int climbStairs(int n) {
        if (cache.get(n) != null) {
            return cache.get(n);
        }

        int nSub1 = climbStairs(n - 1);
        int nSub2 = climbStairs(n - 2);
        int sum = nSub1 + nSub2;
        cache.putIfAbsent(n, sum);

        return sum;
    }
}
