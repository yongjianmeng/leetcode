package com.company.leetcode34;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

//        int[] array = new int[] { 5,7,7,8,8,10 };
//        int target = 10;

        int[] array = new int[] { 2,2,2,2,2,2,2,2,2 };
        int target = 2;

        int[] results = solution.searchRange(array, target);
        System.out.println("[" + results[0] + "," + results[1] + "]");
    }
}
