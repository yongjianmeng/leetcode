package com.company.leetcode42;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trap(new int[] { 0,1,0,2,1,0,1,3,2,1,2,1 }));
        System.out.println(solution.trap(new int[] { 1,2,3,4,5,6,5,4,3,2,1 }));
        System.out.println(solution.trap(new int[] { 1,0,2,0,3,0,4,0,5,0,6,0,5,0,4,0,3,0,2,0,1,0 }));
    }
}
