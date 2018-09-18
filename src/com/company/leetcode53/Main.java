package com.company.leetcode53;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[] { -2,1,-3,4,-1,2,1,-5,4 }));
        System.out.println(solution.maxSubArray(new int[] { -2, 1 }));
        System.out.println(solution.maxSubArray(new int[] { -1 }));
        System.out.println(solution.maxSubArray(new int[] { 0 }));
        System.out.println(solution.maxSubArray(new int[] { -1, -2, -3, 0 }));
    }
}
