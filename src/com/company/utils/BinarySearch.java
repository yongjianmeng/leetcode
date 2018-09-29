package com.company.utils;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = new int[]{ -4, -3, -2, -1, 0, 1, 2, 3, 4 };
        System.out.println(BinarySearch.binarySearch(nums, 0, 0, nums.length - 1));
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

}
