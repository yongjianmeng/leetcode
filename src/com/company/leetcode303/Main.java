package com.company.leetcode303;

public class Main {

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[] { -2, 0, 3, -5, 2, -1 });
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));

    }
}
