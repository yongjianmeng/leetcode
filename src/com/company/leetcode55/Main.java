package com.company.leetcode55;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canJump(new int[] { 4, 3, 2, 1, 0, 5 }));
        System.out.println(solution.canJump(new int[] { 1, 1, 1, 1, 1 }));
        System.out.println(solution.canJump(new int[] { 0, 1, 1, 1, 1 }));
        System.out.println(solution.canJump(new int[] { 0 }));
        System.out.println(solution.canJump(new int[] { 3, 5, 2, 6, 0, 2, 3 }));
        System.out.println(solution.canJump(new int[] { 3, 3, 2, 0, 1, 2, 3 }));
    }
}
