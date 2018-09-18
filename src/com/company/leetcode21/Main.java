package com.company.leetcode21;

public class Main {

    public static void main(String[] args) {
	    Solution solution = new Solution();

	    ListNode l1 = null;
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(0);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);

	    print(solution.mergeTwoLists(l1, l2));
    }

    public static void print (ListNode l) {
        while (l != null) {
            System.out.print("" + l.val + "->");
            l = l.next;
        }
    }
}
