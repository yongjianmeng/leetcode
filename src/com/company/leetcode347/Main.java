package com.company.leetcode347;

import com.company.utils.LeetCodeUtils;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        LeetCodeUtils.printList(solution.topKFrequent(new int[] {1,1,1,1,1,1,2,2,3,4,4,4,4,4,4,4,4,4}, 3));
    }
}
