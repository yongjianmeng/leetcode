package com.company.leetcode66;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Arrays.stream(solution.plusOne(new int[] {1, 2, 3})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(solution.plusOne(new int[] {4,3,2,1})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(solution.plusOne(new int[] {4,3,2,9})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(solution.plusOne(new int[] {4,9,9,9})).forEach(System.out::print);
        System.out.println();
        Arrays.stream(solution.plusOne(new int[] {9,9,9,9})).forEach(System.out::print);
    }


}
