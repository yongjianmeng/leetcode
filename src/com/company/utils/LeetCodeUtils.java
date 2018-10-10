package com.company.utils;

import java.util.List;

public class LeetCodeUtils {

    public static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[nums.length - 1] + "]");
    }

    public static void printList(List<? extends Object> items) {
        System.out.print("[");
        for (int i = 0; i < items.size() - 1; i++) {
            System.out.print(items.get(i) + ", ");
        }
        System.out.println(items.get(items.size() - 1) + "]");
    }

    public static void printListNodes(ListNode head) {
        System.out.print("[");
        while(head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print(head.val + "-> null]");
    }

    // e.g 1->2->3->4
    public static ListNode createListNodes(String str) {
        String[] items = str.split("->");
        ListNode head = null;
        ListNode cur = null;
        for (int i = 0; i < items.length; i++) {
            if (head == null) {
                head = cur = new ListNode(Integer.valueOf(items[i].trim()));
            } else {
                cur.next = new ListNode(Integer.valueOf(items[i].trim()));
                cur = cur.next;
            }
        }
        return head;
    }

}
