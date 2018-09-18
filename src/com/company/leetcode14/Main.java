package com.company.leetcode14;

public class Main {

    public static void main(String[] args) {
	    Solution solution = new Solution();

        System.out.println(solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(solution.longestCommonPrefix(new String[]{}));
        System.out.println(solution.longestCommonPrefix(new String[]{"", "a", "b"}));
        System.out.println(solution.longestCommonPrefix(new String[]{"a", "b", ""}));
        System.out.println(solution.longestCommonPrefix(new String[]{"a", "", "b"}));
        System.out.println(solution.longestCommonPrefix(new String[]{"abc", "abcde", "ab"}));
    }
}
