package com.company.leetcode21;

import com.company.utils.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        if (l1 == null && l2 != null) {
            return l2;
        }

        if (l1 != null && l2 == null) {
            return l1;
        }

        ListNode result, resultIndex;
        ListNode l1Index = l1;
        ListNode l2Index = l2;
        if (l1.val < l2.val) {
            result = new ListNode(l1.val);
            l1Index = l1.next;
        } else {
            result = new ListNode(l2.val);
            l2Index = l2.next;
        }
        resultIndex = result;

        while (true) {
            if (l1Index == null && l2Index == null) {
                return result;
            } else if (l1Index == null) {
                resultIndex.next = new ListNode(l2Index.val);
                l2Index = l2Index.next;
            } else if (l2Index == null) {
                resultIndex.next = new ListNode(l1Index.val);
                l1Index = l1Index.next;
            } else {
                if (l1Index.val < l2Index.val) {
                    resultIndex.next = new ListNode(l1Index.val);
                    l1Index = l1Index.next;
                } else {
                    resultIndex.next = new ListNode(l2Index.val);
                    l2Index = l2Index.next;
                }
            }
            resultIndex = resultIndex.next;
        }
    }
}
