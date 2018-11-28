package com.company.leetcode107;

import com.company.utils.TreeNode;

import java.util.*;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        LinkedList<List<Integer>> results = new LinkedList<>();
        results.addFirst(Arrays.asList(root.val));

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode endNode = root;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (node == endNode && !queue.isEmpty()) {
                List<Integer> result = new ArrayList<>();
                for (int i = 0; i < queue.size(); i++) {
                    result.add(queue.get(i).val);
                }
                results.addFirst(result);
                endNode = node.right != null ? node.right : node.left;
                if (endNode == null) {
                    endNode = queue.getLast();
                }
            }
        }
        return results;
    }
}