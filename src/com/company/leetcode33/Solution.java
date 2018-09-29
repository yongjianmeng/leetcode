package com.company.leetcode33;

class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == nums[mid]) {
            return mid;
        }

        if (nums[start] > nums[end]) {
            if (target == nums[start]) {
                return start;
            }

            if (target == nums[end]) {
                return end;
            }

            if (nums[mid] > nums[end]) {
                if (target > nums[mid] || target < nums[end]) {
                    return binarySearch(nums, target, mid + 1, end - 1);
                } else {
                    return binarySearch(nums, target, start + 1, mid - 1);
                }
            } else {
                if (target > nums[mid] && target < nums[end]) {
                    return binarySearch(nums, target, mid + 1, end - 1);
                } else {
                    return binarySearch(nums, target, start + 1, mid - 1);
                }
            }
        } else {
            if (target > nums[mid]) {
                return binarySearch(nums, target, mid + 1, end);
            } else {
                return binarySearch(nums, target, start, mid - 1);
            }
        }
    }
}