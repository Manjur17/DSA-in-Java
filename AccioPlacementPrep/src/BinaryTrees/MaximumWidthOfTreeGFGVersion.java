package BinaryTrees;

import java.util.*;

public class MaximumWidthOfTreeGFGVersion {
    // Maximum width is defined as the maximum number of nodes in any level.
    static int getMaxWidth(TreeNode root) {
        if (root == null) return -1;
        int ans = -1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            ans = Math.max(ans, n);
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }

        return ans;
    }
}
