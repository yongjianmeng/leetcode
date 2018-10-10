package com.company.leetcode229;

import com.company.utils.LeetCodeUtils;

public class Main {

    public static void main(String[] args) {
	    Solution solution = new Solution();
        LeetCodeUtils.printList(solution.majorityElement(new int[] { 3, 2, 3 }));
        LeetCodeUtils.printList(solution.majorityElement(new int[] { 1,1,1,3,3,2,2,2 }));
        LeetCodeUtils.printList(solution.majorityElement(new int[] { 2,2,9,3,9,3,9,3,9,3,9,3,9,3,9,3,9 }));
    }
}
