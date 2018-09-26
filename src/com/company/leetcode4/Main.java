package com.company.leetcode4;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));
        System.out.println(solution.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));
        System.out.println(solution.findMedianSortedArrays(new int[] { 0 }, new int[] { 1, 2, 3, 4 }));
        System.out.println(solution.findMedianSortedArrays(new int[] { 1, 2, 3, 4 }, new int[] { 0 }));
        System.out.println(solution.findMedianSortedArrays(new int[] { 1, 2, 6 }, new int[] { 3, 4, 5 }));
        System.out.println(solution.findMedianSortedArrays(new int[] { -6, -2, -1 }, new int[] { 3, 4, 5 }));
        System.out.println(solution.findMedianSortedArrays(new int[] { }, new int[] { 3, 4, 5 }));
        System.out.println(solution.findMedianSortedArrays(new int[] { 3, 4, 5  }, new int[] { }));
    }
}
