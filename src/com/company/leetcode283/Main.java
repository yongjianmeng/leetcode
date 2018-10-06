package com.company.leetcode283;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] { 1,0,1,0,3,12,7,0,9 };
        solution.moveZeroes(nums);
        for (int item : nums) {
            System.out.print(item +  " ");
        }
    }
}
