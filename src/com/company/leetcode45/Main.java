package com.company.leetcode45;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.jump(new int[]{1}));
        System.out.println(solution.jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(solution.jump(new int[]{1, 7, 2, 6, 2, 3, 5, 8, 3, 1, 4, 6, 7, 8, 5, 2, 3, 1, 1, 2, 3, 6, 7, 4, 2, 3, 1, 41}));

        System.out.println("---");

        DPSolution dpSolution = new DPSolution();
        System.out.println(dpSolution.jump(new int[]{1}));
        System.out.println(dpSolution.jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(dpSolution.jump(new int[]{1, 7, 2, 6, 2, 3, 5, 8, 3, 1, 4, 6, 7, 8, 5, 2, 3, 1, 1, 2, 3, 6, 7, 4, 2, 3, 1, 41}));

    }
}
