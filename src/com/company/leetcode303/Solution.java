package com.company.leetcode303;

class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if (i < 0) {
            i = 0;
        }
        if (j > this.nums.length - 1) {
            j = this.nums.length - 1;
        }

        int sum = 0;
        for (int pos = i; pos <= j; pos++) {
            sum += this.nums[pos];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */