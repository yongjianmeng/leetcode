package com.company.leetcode169;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[] { 2,2,1,1,1,2,2 }));
        System.out.println(solution.majorityElement(new int[] { 3,2,3 }));
        System.out.println(solution.majorityElement(new int[] { 1 }));
    }
}
