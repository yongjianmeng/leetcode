package com.company.leetcode217;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(new int[] { 1,2,3,4 }));
        System.out.println(solution.containsDuplicate(new int[] { 1,2,3,1 }));
        System.out.println(solution.containsDuplicate(new int[] { 1,1,1,3,3,4,2,4,2 }));
    }
}
