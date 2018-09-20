package com.company.leetcode64;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minPathSum(new int[][] {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        }));
        System.out.println(solution.minPathSum(new int[][] {
                {1, 3, 1, 9},
                {1, 5, 1, 1},
                {4, 2, 1, 5},
                {4, 2, 1, 1},
        }));
    }
}
