package com.company.utils;

public class QuickSort {

    public static void quickSort(int[] nums, int l, int r) {
        if (l < r) {
            int i = adjustArray(nums, l, r);
            quickSort(nums, l, i - 1);
            quickSort(nums, i + 1, r);
        }
    }

    private static int adjustArray(int[] nums, int l, int r) {
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
