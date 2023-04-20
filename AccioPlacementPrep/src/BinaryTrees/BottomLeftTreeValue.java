package BinaryTrees;

import java.util.*;

public class BottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        //if(root.left == null && root.right )
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans = root.val; // at-least 1 node

        while (!q.isEmpty()) {
            boolean isTaken = false;
            int n = q.size();

            for (int i = 0; i < n; i++) {

                TreeNode curr = q.poll();
                if (curr.left != null) {
                    if (!isTaken) {
                        ans = curr.left.val;
                        isTaken = true;
                    }
                    q.add(curr.left);

                }

                if (curr.right != null) {
                    if (!isTaken) {
                        ans = curr.right.val;
                        isTaken = true;
                    }
                    q.add(curr.right);
                }
            }
        }

        return ans;
    }
}
