package com.company.leetcode94;

import com.company.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root != null) {
            traversal(root, results);
        }
        return results;
    }

    public void traversal(TreeNode node, List<Integer> results) {
        if (node.left == null && node.right == null) {
            results.add(node.val);
            return;
        }

        if (node.left != null) {
            traversal(node.left, results);
        }
        results.add(node.val);
        if (node.right != null) {
            traversal(node.right, results);
        }
    }
}