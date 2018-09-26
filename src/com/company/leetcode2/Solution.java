package com.company.leetcode2;

import com.company.utils.ListNode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Idx = l1;
        ListNode l2Idx = l2;
        ListNode result = null, resultIdx = null;
        boolean forward = false;

        while (l1Idx != null && l2Idx != null) {
            int sum = l1Idx.val + l2Idx.val;
            if (forward) {
                sum += 1;
            }

            if (sum > 9) {
                forward = true;
            } else {
                forward = false;
            }

            int val = forward ? sum % 10 : sum;
            if (result == null) {
                resultIdx = result = new ListNode(val);
            } else {
                resultIdx.next = new ListNode(val);
                resultIdx = resultIdx.next;
            }

            l1Idx = l1Idx.next;
            l2Idx = l2Idx.next;
        }

        if (l1Idx != null) {
            append(resultIdx, l1Idx, forward);
        } else if (l2Idx != null) {
            append(resultIdx, l2Idx, forward);
        } else {
            if (forward) {
                resultIdx.next = new ListNode(1);
            }
        }
        return result;
    }

    public void append(ListNode resultIdx, ListNode l, boolean forward) {
        while(l != null) {
            int sum = l.val;
            if (forward) {
                sum += 1;
            }

            if (sum > 9) {
                forward = true;
            } else {
                forward = false;
            }

            int val = forward ? sum % 10 : sum;
            resultIdx.next = new ListNode(val);
            resultIdx = resultIdx.next;
            l = l.next;
        }

        if (forward) {
            resultIdx.next = new ListNode(1);
        }
    }
}