package com.company.leetcode23;

import com.company.utils.ListNode;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode((5));

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode((4));

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        System.out.println(solution.mergeKLists(new ListNode[] { list1, list2, list3 }));
    }
}
