package com.company.leetcode2;

import com.company.utils.ListNode;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        // 2 -> 4 -> 5 -> 1
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(5);
//        l1.next.next.next = new ListNode(1);
//
//        // 5 -> 6 -> 4 -> 9 -> 9
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//        l2.next.next.next = new ListNode(9);
//        l2.next.next.next.next = new ListNode(9);

        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);

        ListNode result = solution.addTwoNumbers(l1, l2);

        while (result != null) {
            if (result.next != null) {
                System.out.print(result.val);
                System.out.print(" -> ");
            } else {
                System.out.print(result.val);
            }

            result = result.next;
        }
    }
}
