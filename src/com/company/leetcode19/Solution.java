package com.company.leetcode19;
import com.company.utils.ListNode;


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre, flag;
        pre = flag = head;
        for (int i = 0; i < n; i++) {
            flag = flag.next;
        }

        if (flag == null) {
            head = head.next;
            return head;
        }

        while (flag.next != null) {
            pre = pre.next;
            flag = flag.next;
        }

        pre.next = pre.next.next;

        return head;
    }
}