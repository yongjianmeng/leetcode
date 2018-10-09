package com.company.leetcode206;

import com.company.utils.ListNode;

// A linked list can be reversed either iteratively or recursively. Could you implement both?
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
//        return reverseIteratively(head);
        return reverseRecursively(head);
    }

    private ListNode reverseIteratively(ListNode head) {
        ListNode pre = head;
        ListNode post = head.next;
        if (post == null) {
            return head;
        }

        pre.next = null;
        while(post != null) {
            if (post.next == null) {
                post.next = pre;
                return post;
            } else {
                ListNode tmp = post.next;
                post.next = pre;
                pre = post;
                post = tmp;
            }
        }
        return post;
    }

    private ListNode reverseRecursively(ListNode head) {
        return recursively(head, head, null);
    }

    private ListNode recursively(ListNode head, ListNode curr, ListNode prev) {
        if (curr.next == null) {
            head = curr;
            curr.next = prev;
            return head;
        }
        ListNode next1 = curr.next;
        curr.next = prev;
        return recursively(head, next1, curr);
    }
}