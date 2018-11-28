package com.company.leetcode101;

import com.company.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode endNodeOfLevel = root;
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                queue.offer(node.left);
                queue.offer(node.right);
                if (node == endNodeOfLevel) {
                    if (!isReverse(queue)) {
                        return false;
                    }
                    if (node.right != null) {
                        endNodeOfLevel = node.right;
                    } else {
                        endNodeOfLevel = node.left;
                        queue.removeLast();
                    }

                }
            }

        }
        return true;
    }

    private boolean isReverse(Queue<TreeNode> queue) {
        List<TreeNode> nodes = new ArrayList<>(queue);
        int i = 0, j = nodes.size() - 1;
        while (i < j) {
            if (nodes.get(i) == null && nodes.get(j) == null) {
                i++;
                j--;
                continue;
            }
            if (nodes.get(i) == null || nodes.get(j) == null) {
                return false;
            }
            if (nodes.get(i).val != nodes.get(j).val) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

}
