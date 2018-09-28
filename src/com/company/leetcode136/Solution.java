package com.company.leetcode136;

/**
 * a XOR 0 = a
 * a XOR a = 0
 * b XOR a XOR b = (b XOR b) XOR a = 0 XOR a = a
 */
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}