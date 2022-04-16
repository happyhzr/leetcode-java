package org.happy.leetcode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    private void helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
    }
}

public class P144 {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode t1 = new TreeNode(1, null, null);
        TreeNode t2 = new TreeNode(2, null, null);
        TreeNode t3 = new TreeNode(3, null, null);
        t1.right = t2;
        t2.left = t3;
        List<Integer> list = s.preorderTraversal(t1);
        for (int i : list) {
            System.out.println(i);
        }
    }
}

