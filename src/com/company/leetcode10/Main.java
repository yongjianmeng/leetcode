package com.company.leetcode10;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isMatch("mississippi", "mis*is*p*."));
        System.out.println(solution.isMatch("xaabyc", "xa*b.c"));
    }
}
