package com.company.leetcode107;

import com.company.utils.LeetCodeUtils;
import com.company.utils.TreeNode;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(-8);
        TreeNode node1 = new TreeNode(-6);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node3.right = node4;
        solution.levelOrderBottom(root);
    }
}
