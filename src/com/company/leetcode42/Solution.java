package com.company.leetcode42;

class Solution {
    public int trap(int[] heights) {
        if (heights.length == 0 || heights.length == 1) {
            return 0;
        }

        int maxHeightIdx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIdx]) {
                maxHeightIdx = i;
            }
        }

        int leftTrapResult = subTrap(heights, maxHeightIdx, 0, maxHeightIdx - 1);
        int rightTrapResult = subTrap(heights, maxHeightIdx, maxHeightIdx + 1, heights.length - 1);
        return leftTrapResult + rightTrapResult;
    }

    private int subTrap(int[] heights, int preMaxHeightIdx, int start, int end) {
        if (start >= end) {
            return 0;
        }

        int maxHeightIdx = start;
        for (int i = start + 1; i <= end; i++) {
            if (heights[i] > heights[maxHeightIdx]) {
                maxHeightIdx = i;
            }
        }

        if (maxHeightIdx > preMaxHeightIdx) {
            // right side
            return trapWater(heights, preMaxHeightIdx, maxHeightIdx) + subTrap(heights, maxHeightIdx, maxHeightIdx + 1, end);
        } else {
            // left side
            return trapWater(heights, maxHeightIdx, preMaxHeightIdx) + subTrap(heights, maxHeightIdx, start, maxHeightIdx - 1);
        }
    }

    private int trapWater(int[] heights, int start, int end) {
        int minHeight = Math.min(heights[start], heights[end]);
        int width = end - start + 1;
        int total = minHeight * width;
        int sumBar = 0;
        for (int i = start; i <= end; i++) {
            sumBar += Math.min(minHeight, heights[i]) * 1;
        }
        return total - sumBar;
    }

}