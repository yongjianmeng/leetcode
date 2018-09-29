package com.company.leetcode23;
import com.company.utils.ListNode;

class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null, resultIter = null;
        int firstNotEmptyIndex;
        while ((firstNotEmptyIndex = find1stNotEmptyIndex(lists)) != -1) {
            int curMinIndex = firstNotEmptyIndex;
            int curMinVal = lists[firstNotEmptyIndex].val;

            for (int i = firstNotEmptyIndex; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val < curMinVal) {
                    curMinVal = lists[i].val;
                    curMinIndex = i;
                }
            }

            if (result == null) {
                resultIter = result = new ListNode(curMinVal);
            } else {
                resultIter.next = new ListNode(curMinVal);
                resultIter = resultIter.next;
            }
            lists[curMinIndex] = lists[curMinIndex].next;
        }

        return result;
    }

    private boolean isAllEmpty (ListNode[] lists) {
        for (ListNode list : lists) {
            if (list != null) {
                return false;
            }
        }
        return true;
    }

    private int find1stNotEmptyIndex(ListNode[] lists) {
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                return i;
            }
        }
        return -1;
    }

}