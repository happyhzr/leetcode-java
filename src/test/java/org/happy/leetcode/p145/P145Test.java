package org.happy.leetcode.p145;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class P145Test {
    @Test
    public void preorderTraversalTest() {
        Solution s = new Solution();
        TreeNode t1 = new TreeNode(1, null, null);
        TreeNode t2 = new TreeNode(2, null, null);
        TreeNode t3 = new TreeNode(3, null, null);
        t1.right = t2;
        t2.left = t3;
        List<Integer> want = Arrays.asList(3, 2, 1);
        List<Integer> got = s.postorderTraversal(t1);
        assertTrue(want.equals(got));
    }
}

