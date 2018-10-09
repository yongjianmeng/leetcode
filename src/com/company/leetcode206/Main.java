package com.company.leetcode206;

import com.company.utils.LeetCodeUtils;
import com.company.utils.ListNode;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        ListNode head = LeetCodeUtils.createListNodes("1->2->3->4->5");
        ListNode head = LeetCodeUtils.createListNodes("1->2");
        LeetCodeUtils.printListNodes(solution.reverseList(head));
    }
}
