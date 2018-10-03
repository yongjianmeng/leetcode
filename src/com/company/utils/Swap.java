package com.company.utils;

public class Swap {

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3 };
        swap1(nums, 0, 2);
        print(nums);
        swap2(nums, 0, 2);
        print(nums);
        swap3(nums, 0, 2);
        print(nums);
    }

    public static void print(int[] nums) {
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void swap1(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void swap2(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }

    public static void swap3(int[] nums, int i, int j) {
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }

}
