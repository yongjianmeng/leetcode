package com.company.leetcode104;

import com.company.utils.TreeNode;

public class MinDepthSolution {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.left.left = new TreeNode(15);
        treeNode.left.right = new TreeNode(7);

        MinDepthSolution solution = new MinDepthSolution();
        System.out.println(solution.minDepth(treeNode));
    }

    public int minDepth(TreeNode root) {
        return minDepth(root, false);
    }

    public int minDepth(TreeNode node, boolean hasBrother) {
        if (node == null) {
            return hasBrother ? Integer.MAX_VALUE : 0;
        }
        return Math.min(
                minDepth(node.left, node.right != null),
                minDepth(node.right, node.left != null)
        ) + 1;
    }
}
