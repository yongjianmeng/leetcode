package com.company.leetcode101;

import com.company.utils.TreeNode;

public class Main {

    public static void main(String[] args) {
        SolutionRecursive solution = new SolutionRecursive();
        TreeNode root = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(4);
        root.left = treeNode1;
        root.right = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.right = treeNode5;
        treeNode2.left = treeNode4;
        treeNode4.left = treeNode6;
        System.out.println(solution.isSymmetric(root));
    }
}
