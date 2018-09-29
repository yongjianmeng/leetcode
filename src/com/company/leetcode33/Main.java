package com.company.leetcode33;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[] { 4,5,6,7,0,1,2 }, 0));
        System.out.println(solution.search(new int[] { 4,5,6,7,0,1,2 }, 3));
        System.out.println(solution.search(new int[] { 4,5,6,7,0,1,2 }, 7));
        System.out.println(solution.search(new int[] { 1,2,3,4,5,6 }, 4));
        System.out.println(solution.search(new int[] { 4,5,6,7,8,1,2,3 }, 8));
        System.out.println(solution.search(new int[] { 5, 1, 2, 3, 4 }, 1));
    }
}
