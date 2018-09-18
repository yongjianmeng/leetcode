package com.company.leetcode26;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int replaceIndex = 0;
        int iterateIndex = 1;

        while (iterateIndex < nums.length) {
            if (nums[iterateIndex] != nums[replaceIndex]) {
                nums[replaceIndex + 1] = nums[iterateIndex];
                replaceIndex++;
            }
            iterateIndex++;
        }
        return replaceIndex + 1;
    }
}
