package com.company.utils;

import java.util.List;

public class LeetCodeUtils {

    public static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[nums.length - 1] + "]");
    }

    public static void printList(List<? extends Object> items) {
        System.out.print("[");
        for (int i = 0; i < items.size() - 1; i++) {
            System.out.print(items.get(i) + ", ");
        }
        System.out.print(items.get(items.size() - 1) + "]");
    }

}
