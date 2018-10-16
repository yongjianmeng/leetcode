package com.company.leetcode75;

import com.company.utils.LeetCodeUtils;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = new int[] {2,0,2,1,1,0,1,1,1,2,2,2,0,1,2,1,2,2,1,2,1};
        int[] nums = new int[] {0};
        solution.sortColors(nums);
        LeetCodeUtils.printArray(nums);
    }
}
