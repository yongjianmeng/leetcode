package com.company.leetcode15;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        quickSort(nums, 0, nums.length - 1);

        List<List<Integer>> results = new ArrayList<>();
        int i = 0;
        while (i < nums.length && nums[i] <= 0) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }

            int j = nums.length - 1;
            while(i < j && nums[j] >= 0) {
                if (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                    j--;
                    continue;
                }
                int target = 0 - (nums[i] + nums[j]);
                int targetIdx = binarySearch(nums, target, i + 1, j - 1);
                if (targetIdx != -1) {
                    List<Integer> result = new ArrayList<>();
                    result.add(nums[i]);
                    result.add(nums[j]);
                    result.add(nums[targetIdx]);
                    results.add(result);
                }
                j--;
            }
            i++;
        }
        return results;
    }

    public static int binarySearch(int[] nums, int search, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (nums[mid] == search) {
            return mid;
        } else if (nums[mid] < search) {
            return binarySearch(nums, search, mid + 1, end);
        } else {
            return binarySearch(nums, search, start, mid - 1);
        }
    }


    private void quickSort(int[] nums, int l, int r) {
        if (l < r) {
            int i = adjustArray(nums, l, r);
            quickSort(nums, l, i - 1);
            quickSort(nums, i + 1, r);
        }
    }

    private int adjustArray(int[] nums, int l, int r) {
        int i = l, j = r;
        int x = nums[l];

        while (i < j) {
            while (i < j && nums[j] >= x) {
                j--;
            }

            if (i < j) {
                nums[i] = nums[j];
                i++;
            }

            while (i < j && nums[i] < x) {
                i++;
            }

            if (i < j) {
                nums[j] = nums[i];
                j--;
            }
        }
        nums[i] = x;

        return i;
    }

}