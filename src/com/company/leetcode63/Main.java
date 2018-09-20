package com.company.leetcode63;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniquePathsWithObstacles(new int[][] {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        }));
        System.out.println(solution.uniquePathsWithObstacles(new int[][] {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        }));
        System.out.println(solution.uniquePathsWithObstacles(new int[][] {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        }));
        System.out.println(solution.uniquePathsWithObstacles(new int[][] {
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        }));
        System.out.println(solution.uniquePathsWithObstacles(new int[][] {
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        }));
    }
}
