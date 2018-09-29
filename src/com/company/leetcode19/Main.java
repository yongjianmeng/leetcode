package com.company.leetcode19;

import com.company.utils.ListNode;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        System.out.println(solution.removeNthFromEnd(list, 1));
    }
}
