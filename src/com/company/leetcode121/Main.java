package com.company.leetcode121;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{ }));
        System.out.println(solution.maxProfit(new int[]{ 1 }));
        System.out.println(solution.maxProfit(new int[]{ 7,1,5,3,6,4 }));
        System.out.println(solution.maxProfit(new int[]{ 7,6,4,3,1 }));
        System.out.println(solution.maxProfit(new int[]{ 7,2,4,9,10,15,20,1,9,20 }));
    }
}
