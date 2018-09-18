package com.company.leetcode13;

public class Main {

    public static void main(String[] args) {
	    Solution solution = new Solution();
        System.out.println(solution.romanToInt("I"));
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("IV"));
        System.out.println(solution.romanToInt("IX"));
        System.out.println(solution.romanToInt("LVIII"));


        System.out.println(solution.romanToInt("MCDLXXVI"));


        System.out.println(solution.romanToInt("MMMXLV"));

        System.out.println(solution.romanToInt("MCMXCIV"));
        System.out.println(solution.romanToInt("MMMCMXCIX"));
    }
}
