package org.happy.leetcode.p144;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class P144Test {
    @Test
    public void preorderTraversalTest() {
        Solution s = new Solution();
        TreeNode t1 = new TreeNode(1, null, null);
        TreeNode t2 = new TreeNode(2, null, null);
        TreeNode t3 = new TreeNode(3, null, null);
        t1.right = t2;
        t2.left = t3;
        List<Integer> want = new ArrayList<>(3);
        want.add(1);
        want.add(2);
        want.add(3);
        List<Integer> got = s.preorderTraversal(t1);
        assertTrue(want.equals(got));
    }
}
