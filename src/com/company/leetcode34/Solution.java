package com.company.leetcode34;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int[] search(int[] nums, int target, int start, int end) {
        if (start > end) {
            return new int[] {-1, -1};
        }

        int mid = start + (end - start) / 2;
        if (nums[mid] < target) {
            return search(nums, target, mid + 1, end);
        } else if (nums[mid] > target) {
            return search(nums, target, start, mid - 1);
        } else {
            return new int[] {
                    searchLeft(nums, target, start, mid),
                    searchRight(nums, target, mid, end)
            };
        }
    }

    private int searchLeft(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        if (start == end) {
            return nums[start] == target ? start : -1;
        }

        if (start + 1 == end) {
            if (nums[start] == target) {
                return start;
            } else if (nums[end] == target) {
                return end;
            } else {
                return -1;
            }
        }

        int mid = start + (end - start) / 2;
        if (nums[mid] < target) {
            return searchLeft(nums, target, mid + 1, end);
        } else {
            // equals
            return searchLeft(nums, target, start, mid);
        }
    }

    private int searchRight(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        if (start == end) {
            return nums[start] == target ? start : -1;
        }

        if (start + 1 == end) {
            if (nums[end] == target) {
                return end;
            } else if (nums[start] == target) {
                return start;
            } else {
                return -1;
            }
        }

        int mid = start + (end - start) / 2;
        if (nums[mid] > target) {
            return searchRight(nums, target, start, mid - 1);
        } else {
            // equals
            return searchRight(nums, target, mid, end);
        }
    }

}