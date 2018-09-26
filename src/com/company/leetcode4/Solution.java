package com.company.leetcode4;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sumLen = nums1.length + nums2.length;
        boolean isOddSumLen = false;
        int medianIndex = sumLen / 2;
        if ((sumLen & 1) != 0) {
            isOddSumLen = true;
        } else {
            isOddSumLen = false;
        }

        int nums1Idx = 0;
        int nums2Idx = 0;
        int[] nums = new int[medianIndex + 1];
        for (int i = 0; i <= medianIndex; i++) {
            if (nums1Idx < nums1.length && nums2Idx < nums2.length) {
                if (nums1[nums1Idx] <= nums2[nums2Idx]) {
                    nums[i] = nums1[nums1Idx];
                    nums1Idx++;
                } else {
                    nums[i] = nums2[nums2Idx];
                    nums2Idx++;
                }
            } else if (nums1Idx < nums1.length) {
                nums[i] = nums1[nums1Idx];
                nums1Idx++;
            } else if (nums2Idx < nums2.length) {
                nums[i] = nums2[nums2Idx];
                nums2Idx++;
            }
        }

        if (isOddSumLen) {
            return nums[medianIndex];
        } else {
            return (double)(nums[medianIndex] + nums[medianIndex - 1]) / 2;
        }
    }
}