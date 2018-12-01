package com.company.leetcode108;

import com.company.utils.TreeNode;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }
        return sortedArrayToBSTCore(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBSTCore(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        int mid = (end + start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBSTCore(nums, start, mid - 1);
        root.right = sortedArrayToBSTCore(nums, mid + 1, end);
        return root;
    }

}