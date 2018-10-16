package com.company.leetcode75;

class Solution {
    public void sortColors(int[] nums) {
        int whiteCnt = 0;
        int blueCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] < nums[i - 1]) {
                int moveStartPos = 0, replaceNum = 0;
                if (nums[i] == 0) {
                    moveStartPos = i - blueCnt - whiteCnt;
                    replaceNum = 0;
                } else if (nums[i] == 1) {
                    moveStartPos = i - blueCnt;
                    replaceNum = 1;
                    whiteCnt++;
                }

                for (int j = i; j > moveStartPos; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[moveStartPos] = replaceNum;
            } else {
                if (nums[i] == 1) {
                    whiteCnt++;
                } else if (nums[i] == 2) {
                    blueCnt++;
                }
            }
        }
    }
}