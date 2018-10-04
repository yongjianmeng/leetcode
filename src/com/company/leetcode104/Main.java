package com.company.leetcode104;

import com.company.utils.TreeNode;

public class Main {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.left.left = new TreeNode(15);
        treeNode.left.right = new TreeNode(7);

        Solution solution = new Solution();
        System.out.println(solution.maxDepth(treeNode));
    }
}
