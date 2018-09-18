package com.company.leetcode746;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.minCostClimbingStairs(new int[]  { 10, 15 }));
        System.out.println(solution.minCostClimbingStairs(new int[]  { 10, 15, 20 }));
        System.out.println(solution.minCostClimbingStairs(new int[]  { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 }));
    }
}
